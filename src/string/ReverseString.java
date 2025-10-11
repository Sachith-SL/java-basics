package string;

public class ReverseString {

    /*  1. use build in method  */
    public static String reverseString1(String str) {
        return str != null?new StringBuilder(str).reverse().toString():null;
    }

    /*  2. basic approach   */
    public String reverseString2(String str) {
//        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    /*  3. recursive approach   */
    public static String reverseString3(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString3(str.substring(1)) + str.charAt(0);
    }
}
