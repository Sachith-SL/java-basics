package number;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramExample {

    public static boolean example1(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }

    public static boolean example2(String str1, String str2) {

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            } else {
                charCountMap.put(c, charCountMap.get(c) - 1);
            }
        }

        return true;
    }
}
