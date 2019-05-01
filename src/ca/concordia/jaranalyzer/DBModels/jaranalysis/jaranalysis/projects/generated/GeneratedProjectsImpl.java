package ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.projects.generated;

import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.projects.Projects;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.projects.Projects}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedProjectsImpl implements Projects {
    
    private int id;
    private String name;
    private String gitCloneLink;
    private int noOfCommit;
    private Integer noOfReleases;
    
    protected GeneratedProjectsImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getGitCloneLink() {
        return gitCloneLink;
    }
    
    @Override
    public int getNoOfCommit() {
        return noOfCommit;
    }
    
    @Override
    public OptionalInt getNoOfReleases() {
        return OptionalUtil.ofNullable(noOfReleases);
    }
    
    @Override
    public Projects setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Projects setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Projects setGitCloneLink(String gitCloneLink) {
        this.gitCloneLink = gitCloneLink;
        return this;
    }
    
    @Override
    public Projects setNoOfCommit(int noOfCommit) {
        this.noOfCommit = noOfCommit;
        return this;
    }
    
    @Override
    public Projects setNoOfReleases(Integer noOfReleases) {
        this.noOfReleases = noOfReleases;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "           + Objects.toString(getId()));
        sj.add("name = "         + Objects.toString(getName()));
        sj.add("gitCloneLink = " + Objects.toString(getGitCloneLink()));
        sj.add("noOfCommit = "   + Objects.toString(getNoOfCommit()));
        sj.add("noOfReleases = " + Objects.toString(OptionalUtil.unwrap(getNoOfReleases())));
        return "ProjectsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Projects)) { return false; }
        final Projects thatProjects = (Projects)that;
        if (this.getId() != thatProjects.getId()) { return false; }
        if (!Objects.equals(this.getName(), thatProjects.getName())) { return false; }
        if (!Objects.equals(this.getGitCloneLink(), thatProjects.getGitCloneLink())) { return false; }
        if (this.getNoOfCommit() != thatProjects.getNoOfCommit()) { return false; }
        if (!Objects.equals(this.getNoOfReleases(), thatProjects.getNoOfReleases())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getGitCloneLink());
        hash = 31 * hash + Integer.hashCode(getNoOfCommit());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getNoOfReleases()));
        return hash;
    }
}