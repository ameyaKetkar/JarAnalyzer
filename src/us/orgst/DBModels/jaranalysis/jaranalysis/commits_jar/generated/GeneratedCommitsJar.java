package us.orgst.DBModels.jaranalysis.jaranalysis.commits_jar.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import us.orgst.DBModels.jaranalysis.jaranalysis.commits_jar.CommitsJar;

/**
 * The generated base for the {@link
 * us.orgst.DBModels.jaranalysis.jaranalysis.commits_jar.CommitsJar}-interface
 * representing entities of the {@code commits_jar}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCommitsJar {
    
    /**
     * This Field corresponds to the {@link CommitsJar} field that can be
     * obtained using the {@link CommitsJar#getSha()} method.
     */
    StringField<CommitsJar, String> SHA = StringField.create(
        Identifier.SHA,
        CommitsJar::getSha,
        CommitsJar::setSha,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CommitsJar} field that can be
     * obtained using the {@link CommitsJar#getJarId()} method.
     */
    IntField<CommitsJar, Integer> JAR_ID = IntField.create(
        Identifier.JAR_ID,
        CommitsJar::getJarId,
        CommitsJar::setJarId,
        TypeMapper.primitive(),
        false
    );
    
    /**
     * Returns the sha of this CommitsJar. The sha field corresponds to the
     * database column jaranalysis.jaranalysis.commits_jar.SHA.
     * 
     * @return the sha of this CommitsJar
     */
    String getSha();
    
    /**
     * Returns the jarId of this CommitsJar. The jarId field corresponds to the
     * database column jaranalysis.jaranalysis.commits_jar.JarID.
     * 
     * @return the jarId of this CommitsJar
     */
    int getJarId();
    
    /**
     * Sets the sha of this CommitsJar. The sha field corresponds to the
     * database column jaranalysis.jaranalysis.commits_jar.SHA.
     * 
     * @param sha to set of this CommitsJar
     * @return    this CommitsJar instance
     */
    CommitsJar setSha(String sha);
    
    /**
     * Sets the jarId of this CommitsJar. The jarId field corresponds to the
     * database column jaranalysis.jaranalysis.commits_jar.JarID.
     * 
     * @param jarId to set of this CommitsJar
     * @return      this CommitsJar instance
     */
    CommitsJar setJarId(int jarId);
    
    enum Identifier implements ColumnIdentifier<CommitsJar> {
        
        SHA    ("SHA"),
        JAR_ID ("JarID");
        
        private final String columnId;
        private final TableIdentifier<CommitsJar> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "jaranalysis";
        }
        
        @Override
        public String getSchemaId() {
            return "jaranalysis";
        }
        
        @Override
        public String getTableId() {
            return "commits_jar";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<CommitsJar> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}