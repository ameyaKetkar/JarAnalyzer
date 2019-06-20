package ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commits.generated;

import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commits.Commits;
import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commits.CommitsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commits.Commits}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCommitsManagerImpl 
extends AbstractManager<Commits> 
implements GeneratedCommitsManager {
    
    private final TableIdentifier<Commits> tableIdentifier;
    
    protected GeneratedCommitsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("JarAnalysis", "JarAnalysis", "Commits");
    }
    
    @Override
    public TableIdentifier<Commits> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Commits>> fields() {
        return CommitsManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Commits>> primaryKeyFields() {
        return Stream.of(
            Commits.SHA
        );
    }
}