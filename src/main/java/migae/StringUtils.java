/* replace apache commons StringUtils, which throws a security exception on gae */

package migae;

/* from apache StringUtils
   https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/StringUtils.java
*/

public class StringUtils {

    public static boolean isBlank(final CharSequence cs) {
	int strLen;
	if (cs == null || (strLen = cs.length()) == 0) {
	    return true;
	}
	for (int i = 0; i < strLen; i++) {
	    if (Character.isWhitespace(cs.charAt(i)) == false) {
		return false;
	    }
	}
	return true;
    }

    public static int length(final CharSequence cs) {
        return cs == null ? 0 : cs.length();
    }

}
