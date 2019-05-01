package ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commits.generated;

import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commits.Commits;
import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.projects.Projects;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.commits.Commits}-interface
 * representing entities of the {@code Commits}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCommits {
    
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getSha()} method.
     */
    StringField<Commits, String> SHA = StringField.create(
        Identifier.SHA,
        Commits::getSha,
        Commits::setSha,
        TypeMapper.identity(),
        true
    );
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getTime()} method.
     */
    ComparableField<Commits, Timestamp, Timestamp> TIME = ComparableField.create(
        Identifier.TIME,
        Commits::getTime,
        Commits::setTime,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getFilesAdded()} method.
     */
    ComparableField<Commits, Integer, Integer> FILES_ADDED = ComparableField.create(
        Identifier.FILES_ADDED,
        o -> OptionalUtil.unwrap(o.getFilesAdded()),
        Commits::setFilesAdded,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getFilesRemoved()} method.
     */
    ComparableField<Commits, Integer, Integer> FILES_REMOVED = ComparableField.create(
        Identifier.FILES_REMOVED,
        o -> OptionalUtil.unwrap(o.getFilesRemoved()),
        Commits::setFilesRemoved,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getFilesModified()} method.
     */
    ComparableField<Commits, Integer, Integer> FILES_MODIFIED = ComparableField.create(
        Identifier.FILES_MODIFIED,
        o -> OptionalUtil.unwrap(o.getFilesModified()),
        Commits::setFilesModified,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getTag()} method.
     */
    StringField<Commits, String> TAG = StringField.create(
        Identifier.TAG,
        o -> OptionalUtil.unwrap(o.getTag()),
        Commits::setTag,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getIsRelease()} method.
     */
    StringField<Commits, String> IS_RELEASE = StringField.create(
        Identifier.IS_RELEASE,
        o -> OptionalUtil.unwrap(o.getIsRelease()),
        Commits::setIsRelease,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Commits} field that can be obtained
     * using the {@link Commits#getProjectId()} method.
     */
    IntForeignKeyField<Commits, Integer, Projects> PROJECT_ID = IntForeignKeyField.create(
        Identifier.PROJECT_ID,
        Commits::getProjectId,
        Commits::setProjectId,
        Projects.ID,
        TypeMapper.primitive(),
        false
    );
    
    /**
     * Returns the sha of this Commits. The sha field corresponds to the
     * database column JarAnalysis.JarAnalysis.Commits.SHA.
     * 
     * @return the sha of this Commits
     */
    String getSha();
    
    /**
     * Returns the time of this Commits. The time field corresponds to the
     * database column JarAnalysis.JarAnalysis.Commits.Time.
     * 
     * @return the time of this Commits
     */
    Timestamp getTime();
    
    /**
     * Returns the filesAdded of this Commits. The filesAdded field corresponds
     * to the database column JarAnalysis.JarAnalysis.Commits.Files_Added.
     * 
     * @return the filesAdded of this Commits
     */
    OptionalInt getFilesAdded();
    
    /**
     * Returns the filesRemoved of this Commits. The filesRemoved field
     * corresponds to the database column
     * JarAnalysis.JarAnalysis.Commits.Files_Removed.
     * 
     * @return the filesRemoved of this Commits
     */
    OptionalInt getFilesRemoved();
    
    /**
     * Returns the filesModified of this Commits. The filesModified field
     * corresponds to the database column
     * JarAnalysis.JarAnalysis.Commits.Files_Modified.
     * 
     * @return the filesModified of this Commits
     */
    OptionalInt getFilesModified();
    
    /**
     * Returns the tag of this Commits. The tag field corresponds to the
     * database column JarAnalysis.JarAnalysis.Commits.Tag.
     * 
     * @return the tag of this Commits
     */
    Optional<String> getTag();
    
    /**
     * Returns the isRelease of this Commits. The isRelease field corresponds to
     * the database column JarAnalysis.JarAnalysis.Commits.isRelease.
     * 
     * @return the isRelease of this Commits
     */
    Optional<String> getIsRelease();
    
    /**
     * Returns the projectId of this Commits. The projectId field corresponds to
     * the database column JarAnalysis.JarAnalysis.Commits.ProjectID.
     * 
     * @return the projectId of this Commits
     */
    int getProjectId();
    
    /**
     * Sets the sha of this Commits. The sha field corresponds to the database
     * column JarAnalysis.JarAnalysis.Commits.SHA.
     * 
     * @param sha to set of this Commits
     * @return    this Commits instance
     */
    Commits setSha(String sha);
    
    /**
     * Sets the time of this Commits. The time field corresponds to the database
     * column JarAnalysis.JarAnalysis.Commits.Time.
     * 
     * @param time to set of this Commits
     * @return     this Commits instance
     */
    Commits setTime(Timestamp time);
    
    /**
     * Sets the filesAdded of this Commits. The filesAdded field corresponds to
     * the database column JarAnalysis.JarAnalysis.Commits.Files_Added.
     * 
     * @param filesAdded to set of this Commits
     * @return           this Commits instance
     */
    Commits setFilesAdded(Integer filesAdded);
    
    /**
     * Sets the filesRemoved of this Commits. The filesRemoved field corresponds
     * to the database column JarAnalysis.JarAnalysis.Commits.Files_Removed.
     * 
     * @param filesRemoved to set of this Commits
     * @return             this Commits instance
     */
    Commits setFilesRemoved(Integer filesRemoved);
    
    /**
     * Sets the filesModified of this Commits. The filesModified field
     * corresponds to the database column
     * JarAnalysis.JarAnalysis.Commits.Files_Modified.
     * 
     * @param filesModified to set of this Commits
     * @return              this Commits instance
     */
    Commits setFilesModified(Integer filesModified);
    
    /**
     * Sets the tag of this Commits. The tag field corresponds to the database
     * column JarAnalysis.JarAnalysis.Commits.Tag.
     * 
     * @param tag to set of this Commits
     * @return    this Commits instance
     */
    Commits setTag(String tag);
    
    /**
     * Sets the isRelease of this Commits. The isRelease field corresponds to
     * the database column JarAnalysis.JarAnalysis.Commits.isRelease.
     * 
     * @param isRelease to set of this Commits
     * @return          this Commits instance
     */
    Commits setIsRelease(String isRelease);
    
    /**
     * Sets the projectId of this Commits. The projectId field corresponds to
     * the database column JarAnalysis.JarAnalysis.Commits.ProjectID.
     * 
     * @param projectId to set of this Commits
     * @return          this Commits instance
     */
    Commits setProjectId(int projectId);
    
    /**
     * Queries the specified manager for the referenced Projects. If no such
     * Projects exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Projects findProjectId(Manager<Projects> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Commits> {
        
        SHA            ("SHA"),
        TIME           ("Time"),
        FILES_ADDED    ("Files_Added"),
        FILES_REMOVED  ("Files_Removed"),
        FILES_MODIFIED ("Files_Modified"),
        TAG            ("Tag"),
        IS_RELEASE     ("isRelease"),
        PROJECT_ID     ("ProjectID");
        
        private final String columnId;
        private final TableIdentifier<Commits> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "JarAnalysis";
        }
        
        @Override
        public String getSchemaId() {
            return "JarAnalysis";
        }
        
        @Override
        public String getTableId() {
            return "Commits";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Commits> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}