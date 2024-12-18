package number;

public class OddNumbersCheck {
    public static boolean check(int[] numArr) {
        boolean isPresent = false;
        for (int i : numArr) {
            if (i % 2 == 1)
                isPresent = true;
        }
        return isPresent;
    }
}
