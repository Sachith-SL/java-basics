package string;

public class VowelCheck {

    //1. method
    public static boolean isPresent(String str) {

        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};

        for (char a : str.toLowerCase().toCharArray()) {
            for (char c : vowelArray) {
                if (a == c) {
                    return true;
                }
            }
        }
        return false;
    }

    //2. method
    public static boolean isPresent2(String str) {
        return str.toLowerCase().matches("\\d{2}");
    }
}
