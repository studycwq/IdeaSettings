#set ($Name = ${NAME})
#set ($RepoName = $Name.substring(0,1).toLowerCase() + $Name.substring(1))
#set ($ServiceName = $Name.replace("Impl", ""))
#set ($EntityName = $Name.replace("ServiceImpl", ""))
#set ($entityName = $EntityName.substring(0,1).toLowerCase() + $EntityName.substring(1))

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import com.hboxs.asl.dao.${EntityName}Dao;
import com.hboxs.asl.entity.$EntityName;
import com.hboxs.asl.service.$ServiceName;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Service -- $EntityName
 * @author will
 * @date ${DATE}
 */
@Service(value = "$RepoName")
public class ${NAME} extends BaseServiceImpl<$EntityName, Long> implements $ServiceName {

    @Resource(name = "${entityName}DaoImpl")
    public void setBaseDao(${EntityName}Dao ${entityName}Dao) {
        super.setBaseDao(${entityName}Dao);
    }
}