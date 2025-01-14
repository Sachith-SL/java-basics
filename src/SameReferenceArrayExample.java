import java.util.Arrays;

public class SameReferenceArrayExample {
    public static void example(){
        int[] original = {3, 1, 4, 1, 5};
        int[] anotherArray = original;
        int[] anotherArray2 = Arrays.copyOf(original, original.length);

        Arrays.sort(original);

        for (int element:anotherArray2){
            System.out.println(element);
        }
        System.out.println("---------------------");

        for (int element:anotherArray){
            System.out.println(element);
        }
    }
}
