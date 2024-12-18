package string;

public class FindAPatternInString {
    //abc$123
    public static boolean isMatches(String str) {
        return str.matches("^[a-zA-Z]{3}\\$\\d{3}$");
    }

    //example@gmail.com
    public static boolean isMatches2(String str) {
        return str.matches("^[a-zA-Z0-9]+@gmail\\.com$");
    }
}
