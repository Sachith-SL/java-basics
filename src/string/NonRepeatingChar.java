package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void test(String str){
        Map<Character,Integer> charCount = new LinkedHashMap<>();
        for (char ch:str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character, Integer> entry: charCount.entrySet()){
//            System.out.println(entry);
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
