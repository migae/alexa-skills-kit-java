// replace apache commons Validate, which throws a security exception on gae

// https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/Validate.java

package migae;

public class Validate {

    private static final String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";

    public static <T extends CharSequence> T notBlank(final T chars, final String message, final Object... values) {
        if (chars == null) {
            throw new NullPointerException(String.format(message, values));
        }
        if (StringUtils.isBlank(chars)) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return chars;
    }

    public static <T> T notNull(final T object) {
        return notNull(object, DEFAULT_IS_NULL_EX_MESSAGE);
    }

    public static <T> T notNull(final T object, final String message, final Object... values) {
        if (object == null) {
            throw new NullPointerException(String.format(message, values));
        }
        return object;
    }

}
