package number;

public class Factorial {

    public static int example(int n) {
        if (n == 1) {
            return 1;
        }
        return n * example(n - 1);

    }
}
