#set ($Name = ${NAME})
#set ($EntityName = $Name.replace("Dao", ""))

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import com.hboxs.asl.entity.$EntityName;

/**
 * Dao - $EntityName
 * @author will
 * @date ${DATE}
 */
public interface ${NAME} extends BaseDao<$EntityName, Long> {

}