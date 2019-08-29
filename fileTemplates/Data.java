#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import lombok.Data;
#parse("File Header.java")
@Data
public class ${NAME} implements Serializable{
    public ${NAME} (){
    }
}
