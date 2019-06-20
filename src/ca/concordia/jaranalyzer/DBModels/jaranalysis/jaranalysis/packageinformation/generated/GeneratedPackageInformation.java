package ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.packageinformation.generated;

import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.jarinformation.JarInformation;
import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.packageinformation.PackageInformation;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.packageinformation.PackageInformation}-interface
 * representing entities of the {@code PackageInformation}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedPackageInformation {
    
    /**
     * This Field corresponds to the {@link PackageInformation} field that can
     * be obtained using the {@link PackageInformation#getId()} method.
     */
    LongField<PackageInformation, Long> ID = LongField.create(
        Identifier.ID,
        PackageInformation::getId,
        PackageInformation::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link PackageInformation} field that can
     * be obtained using the {@link PackageInformation#getJarId()} method.
     */
    IntForeignKeyField<PackageInformation, Integer, JarInformation> JAR_ID = IntForeignKeyField.create(
        Identifier.JAR_ID,
        PackageInformation::getJarId,
        PackageInformation::setJarId,
        JarInformation.ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link PackageInformation} field that can
     * be obtained using the {@link PackageInformation#getName()} method.
     */
    StringField<PackageInformation, String> NAME = StringField.create(
        Identifier.NAME,
        PackageInformation::getName,
        PackageInformation::setName,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this PackageInformation. The id field corresponds to
     * the database column JarAnalysis.JarAnalysis.PackageInformation.ID.
     * 
     * @return the id of this PackageInformation
     */
    long getId();
    
    /**
     * Returns the jarId of this PackageInformation. The jarId field corresponds
     * to the database column JarAnalysis.JarAnalysis.PackageInformation.JarID.
     * 
     * @return the jarId of this PackageInformation
     */
    int getJarId();
    
    /**
     * Returns the name of this PackageInformation. The name field corresponds
     * to the database column JarAnalysis.JarAnalysis.PackageInformation.Name.
     * 
     * @return the name of this PackageInformation
     */
    String getName();
    
    /**
     * Sets the id of this PackageInformation. The id field corresponds to the
     * database column JarAnalysis.JarAnalysis.PackageInformation.ID.
     * 
     * @param id to set of this PackageInformation
     * @return   this PackageInformation instance
     */
    PackageInformation setId(long id);
    
    /**
     * Sets the jarId of this PackageInformation. The jarId field corresponds to
     * the database column JarAnalysis.JarAnalysis.PackageInformation.JarID.
     * 
     * @param jarId to set of this PackageInformation
     * @return      this PackageInformation instance
     */
    PackageInformation setJarId(int jarId);
    
    /**
     * Sets the name of this PackageInformation. The name field corresponds to
     * the database column JarAnalysis.JarAnalysis.PackageInformation.Name.
     * 
     * @param name to set of this PackageInformation
     * @return     this PackageInformation instance
     */
    PackageInformation setName(String name);
    
    /**
     * Queries the specified manager for the referenced JarInformation. If no
     * such JarInformation exists, an {@code NullPointerException} will be
     * thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    JarInformation findJarId(Manager<JarInformation> foreignManager);
    
    enum Identifier implements ColumnIdentifier<PackageInformation> {
        
        ID     ("ID"),
        JAR_ID ("JarID"),
        NAME   ("Name");
        
        private final String columnId;
        private final TableIdentifier<PackageInformation> tableIdentifier;
        
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
            return "PackageInformation";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<PackageInformation> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}