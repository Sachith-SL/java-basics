package number;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FibonacciSequencePrint {

    //  time complexity :2^n
    public static int getFibonacciNumber1(int n) {
        if (n == 1)
            return 0;
        if (n == 2) {
            return 1;
        }

        return getFibonacciNumber1(n - 1) + getFibonacciNumber1(n - 2);

    }

    static HashMap<Integer, Integer> memo = new HashMap<>();

    //    Time Complexity: O(n), Space Complexity O(n)
    public static int getFibonacciNumber2(int n) {

        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        if (memo.containsKey(n))
            return memo.get(n);

        int result = getFibonacciNumber2(n - 1) + getFibonacciNumber2(n - 2);
        memo.put(n, result);
        return result;

    }

    //    Time Complexity: O(n), Space Complexity O(1)
    public static int getFibonacciNumber3(int n) {
        if (n == 1)
            return 0;
        if (n == 2) {
            return 1;
        }

        int a = 0, b = 1, temp;

        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

}
