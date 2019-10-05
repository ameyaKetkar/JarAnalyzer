package us.orgst.DBModels.jaranalysis.jaranalysis.method_information.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import us.orgst.DBModels.jaranalysis.jaranalysis.method_information.MethodInformation;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * us.orgst.DBModels.jaranalysis.jaranalysis.method_information.MethodInformation}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMethodInformationManager extends Manager<MethodInformation> {
    
    TableIdentifier<MethodInformation> IDENTIFIER = TableIdentifier.of("jaranalysis", "jaranalysis", "method_information");
    List<Field<MethodInformation>> FIELDS = unmodifiableList(asList(
        MethodInformation.ID,
        MethodInformation.CLASS_ID,
        MethodInformation.NAME,
        MethodInformation.RETURN_TYPE,
        MethodInformation.ACCESS_MODIFIERS,
        MethodInformation.IS_ABSTRACT,
        MethodInformation.IS_STATIC,
        MethodInformation.IS_SYNCHRONIZED,
        MethodInformation.IS_CONSTRUCTOR
    ));
    
    @Override
    default Class<MethodInformation> getEntityClass() {
        return MethodInformation.class;
    }
}