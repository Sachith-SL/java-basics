package number;

/* 1,2,3,5,7,11,13,17, ... */

public class PrimeNumberCheck {
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
