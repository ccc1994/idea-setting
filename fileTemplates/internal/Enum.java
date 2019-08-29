#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import lombok.Getter;
#parse("File Header.java")
@Getter
@RequiredArgsConstructor
public enum ${NAME} {
}
