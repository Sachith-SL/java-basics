package string;

public class PalindromeCheck {

    //    Time Complexity: O(n), Space Complexity O(1)
    public static Boolean isPalindrome1(String str) {

        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
    //    Time Complexity: O(n), Space Complexity O(1)
    public static Boolean isPalindrome2(String str, int start, int end) {

        int n = str.length();

        while (start<end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void findPalindromicSubstrings(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isPalindrome2(str, i, j)) {
                    System.out.println(str.substring(i, j + 1));
                }
            }
        }
    }
}
