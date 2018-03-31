#set ($Name = ${NAME})
#set ($EntityName = $Name.replace("Service", ""))

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import com.hboxs.asl.entity.$EntityName;

/**
 * Service - $EntityName
 * @author will
 * @date ${DATE}
 */
public interface ${NAME} extends BaseService<$EntityName, Long> {

}