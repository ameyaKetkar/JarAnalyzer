package ca.concordia.jaranalyzer;

import static java.util.stream.Collectors.toMap;

import com.T2R.common.Util.Pair;
import com.jasongoodwin.monads.Try;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevSort;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.CommitTimeRevFilter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Util {



    static Try<Git> tryCloningRepo(String projectName, String cloneLink, String path) {
        return Try.ofFailable(() -> Git.open(new File(path + projectName)))
                .onFailure(e -> System.out.println("Did not find " + projectName + " at" + path))
                .orElseTry(() ->
                        Git.cloneRepository().setURI(cloneLink).setDirectory(new File(path + projectName)).call())
                .onFailure(e -> System.out.println("Could not clone " + projectName));

    }

    static Map<String, String> readProjects(String path){
        try {
            return Files.readAllLines(Paths.get(path)).parallelStream()
                    .map(e -> Pair.P(e.split(",")[0], e.split(",")[1]))
                    .collect(toMap(Pair::fst, Pair::snd));
        }catch (Exception e){
            System.out.println("Could not read projects");
            throw new RuntimeException("Could not read projects");
        }
    }

    static List<RevCommit> getCommits(Git git, RevSort order) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = "2016-08-08" ;
        return Try.ofFailable(() -> {
            RevWalk walk = new RevWalk(git.getRepository());
            walk.markStart(walk.parseCommit(git.getRepository().resolve("HEAD")));
            walk.sort(order);
            walk.setRevFilter(CommitTimeRevFilter.after(ft.parse(input)));
            return walk;
        })
                .map(walk -> {
                    Iterator<RevCommit> iter = walk.iterator();
                    List<RevCommit> l = new ArrayList<>();
                    while(iter.hasNext()){
                        l.add(iter.next()); }
                    walk.dispose();
                    return l;
                })
                .onSuccess(l -> System.out.println("Total number of commits found : " + l.size()))
                .onFailure(Throwable::printStackTrace)

                .orElse(new ArrayList<>());
    }

}
