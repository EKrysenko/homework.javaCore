package codingbat.string1;

/**
 * Given a string, return a string length 2 made of its first 2 chars.
 * If the string length is less than 2, use '@' for the missing chars.

 atFirst("hello") → "he"
 atFirst("hi") → "hi"
 atFirst("h") → "h@"
 */
public class AtFirst {
    public static String atFirst(String str) {
        if (str.length() == 1){
            return str + '@';
        }
        if (str.length() == 0){
            return str + "@@";
        }
        return str.substring(0, 2);
    }
}

