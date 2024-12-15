package string;

public class ReverseString {

    public String reverseString(String str){
        String reversedString = "";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
//        for(int i=str.length()-1;i>=0;i--){
//            sb.append(str.charAt(i));
//        }
//        reversedString = sb.toString();


        return sb.toString();
    }
}
