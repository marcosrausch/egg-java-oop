package services;

public class Utils {
    
    public static final char[] VOWELS = {
        'a', 'A',
        'e', 'E',
        'i', 'I',
        'o', 'O',
        'u', 'U'
    };

    public static String removeLastString(String str) {
        int last = str.length() - 1;
        return str.substring(0, last);
    }
    
    public static int last(String string) {
        return string.length() - 1;
    }
}
