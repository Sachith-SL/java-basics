package number;

/* 1,2,3,5,7,11,13,17, ... */

public class PrimeNumberCheck {

    public static boolean isPrimeNumber(int num) {

        int squareRoot = (int) Math.sqrt(num);

        if (num < 2) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }

        if(num %2 == 0){
            return false;
        }
        for (int i = 3; i <= squareRoot; i +=2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
