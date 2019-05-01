package ca.concordia.jaranalyzer;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.BuildPluginManager;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.collection.CollectRequest;
import org.eclipse.aether.graph.DependencyFilter;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.resolution.ArtifactResult;
import org.eclipse.aether.resolution.DependencyRequest;
import org.eclipse.aether.resolution.DependencyResolutionException;
import org.eclipse.aether.resolution.DependencyResult;
import org.eclipse.aether.util.artifact.JavaScopes;
import org.eclipse.aether.util.filter.DependencyFilterUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Mojo(name = "download-mojo", defaultPhase = LifecyclePhase.PACKAGE)
public class DownloadMojo extends AbstractMojo {

    @Component
    private MavenProject mavenProject;

    @Component
    private MavenSession mavenSession;

    @Component
    private BuildPluginManager pluginManager;

    @Component
    private RepositorySystem repositorySystem;

    @Parameter(defaultValue = "${repositorySystemSession}", readonly = true)
    private RepositorySystemSession repositorySystemSession;

    @Parameter(defaultValue = "${project.remotePluginRepositories}", readonly = true)
    private List<RemoteRepository> remoteRepositories;

    public void execute() throws MojoExecutionException {
        // We want to collect the files in our local repository here
        List theResult = new ArrayList<>();

        String theGroupId = ""; // Replace with your Artifact
        String theArtifactId = ""; // Replace with your Artifact
        String theArtifactVersion = ""; // Replace with your Artifact
        String theClassifier = ""; // Replace with your Artifact
        String theExtension = ""; // Replace with your Artifact
        String theScope = JavaScopes.COMPILE; // Replace with your Artifact

        // We create a collect request here
        // By adding the remote repositories we force Aether to download artifacts if they
        // are not already in the local reposaitory
        CollectRequest theCollectRequest = new CollectRequest();
        theCollectRequest.setRoot(new org.eclipse.aether.graph.Dependency(new DefaultArtifact(theGroupId, theArtifactId,
                theClassifier, theExtension, theArtifactVersion), theScope));
        for (RemoteRepository theRepository : remoteRepositories) {
            theCollectRequest.addRepository(theRepository);
        }

        // We filter dependencies here, as we only want compile scope
        DependencyFilter theDependencyFilter = DependencyFilterUtils.classpathFilter(theScope);
        DependencyRequest theDependencyRequest = new DependencyRequest(theCollectRequest, theDependencyFilter);
        try {
            DependencyResult theDependencyResult = repositorySystem.resolveDependencies(repositorySystemSession, theDependencyRequest);
            for (ArtifactResult theArtifactResult : theDependencyResult.getArtifactResults()) {
                Artifact theResolved = theArtifactResult.getArtifact();
                // Now we have the artifact file locally stored available
                // and we can do something with it
                File theLocallyStoredFile = theResolved.getFile();
                theResult.add(theLocallyStoredFile);
            }
        } catch (DependencyResolutionException e) {
            throw new MojoExecutionException("Error while resolving dependency", e);
        }
    }
}
