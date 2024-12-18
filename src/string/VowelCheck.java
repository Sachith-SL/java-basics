package string;

public class VowelCheck {
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

    public static boolean isPresent2(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
