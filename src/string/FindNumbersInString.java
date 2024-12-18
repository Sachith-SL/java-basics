package string;

public class FindNumbersInString {
    public static boolean isPresent(String str) {
        return str.matches("\\d");
    }

    public static boolean isPresent2(String str) {

        return str.matches(".*\\d.*");
    }
}
