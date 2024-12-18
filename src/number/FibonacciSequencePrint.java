package number;

import java.util.HashSet;
import java.util.Set;

public class FibonacciSequencePrint {
    public static int getFibonacciNumber(int n) {
        int[] fibonacciArr = new int[n];
        if (n == 1)
            return 0;
        if (n == 2) {
            return 1;
        }
        if (n >= 3) {
            return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        } else return 0;

    }

    public static void printSeries(int n) {
        for (int i = n; i >= 1; i--) {
            if (i == 1)
                System.out.println(0);
            else {
                System.out.print(getFibonacciNumber(i) + ", ");
            }

        }

    }
}
