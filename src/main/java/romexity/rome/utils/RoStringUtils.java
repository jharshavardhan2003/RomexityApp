package romexity.rome.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RoStringUtils {

    public static boolean isNullOrEmpty(Object string) {
        return Objects.isNull(string) || StringUtils.isBlank(string.toString());
    }

    public static boolean isNotNullOrEmpty(Object string) {
        return !isNullOrEmpty(string);
    }
}
