#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import javax.persistence.*;

/**
 * Entity - ${NAME}
 * @author will
 * @date ${DATE}
 */
@Entity
@Table(name = "${Table_Name}")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "${Table_Name}_sequence")
public class ${NAME} extends BaseEntity {

}