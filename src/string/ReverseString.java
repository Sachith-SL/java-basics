package string;

public class ReverseString {

    public String reverseString1(String str) {

        StringBuilder sb = new StringBuilder(str);

        //1. use build in method
        return sb.reverse().toString();
    }

    public String reverseString2(String str) {
        StringBuilder sb = new StringBuilder(str);
        //basic approach
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static String reverseString3(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
//        return str.substring(1)+str.charAt(0);
        return reverseString3(str.substring(1)) + str.charAt(0);
    }
}
