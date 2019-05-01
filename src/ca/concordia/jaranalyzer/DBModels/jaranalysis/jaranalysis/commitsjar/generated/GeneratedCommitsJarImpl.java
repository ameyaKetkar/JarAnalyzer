package ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commitsjar.generated;

import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commitsjar.CommitsJar;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commitsjar.CommitsJar}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCommitsJarImpl implements CommitsJar {
    
    private String sha;
    private int jarId;
    
    protected GeneratedCommitsJarImpl() {}
    
    @Override
    public String getSha() {
        return sha;
    }
    
    @Override
    public int getJarId() {
        return jarId;
    }
    
    @Override
    public CommitsJar setSha(String sha) {
        this.sha = sha;
        return this;
    }
    
    @Override
    public CommitsJar setJarId(int jarId) {
        this.jarId = jarId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("sha = "   + Objects.toString(getSha()));
        sj.add("jarId = " + Objects.toString(getJarId()));
        return "CommitsJarImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof CommitsJar)) { return false; }
        final CommitsJar thatCommitsJar = (CommitsJar)that;
        if (!Objects.equals(this.getSha(), thatCommitsJar.getSha())) { return false; }
        if (this.getJarId() != thatCommitsJar.getJarId()) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getSha());
        hash = 31 * hash + Integer.hashCode(getJarId());
        return hash;
    }
}