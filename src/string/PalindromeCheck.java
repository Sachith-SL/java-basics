package string;

public class PalindromeCheck {

    public static Boolean isPalindrome(String str) {
        Boolean isPalindrome = true;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                isPalindrome = true;
                break;
            } else {
                return false;
            }
        }
        return isPalindrome;
    }
}
