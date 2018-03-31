#set ($Name = ${NAME})
#set ($RepoName = $Name.substring(0,1).toLowerCase() + $Name.substring(1))
#set ($DaoName = $Name.replace("Impl", ""))
#set ($EntityName = $Name.replace("DaoImpl", ""))

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.hboxs.asl.dao.$DaoName;
import com.hboxs.asl.entity.$EntityName;
import org.springframework.stereotype.Repository;

/**
 * Dao - $EntityName
 * @author will
 * @date ${DATE}
 */
@Repository("$RepoName")
public class ${NAME} extends BaseDaoImpl<$EntityName, Long> implements $DaoName {

}