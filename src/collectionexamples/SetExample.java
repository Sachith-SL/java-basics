package collectionexamples;

import java.util.HashSet;

public class SetExample {
    public static void example() {
        HashSet<Integer> set = new HashSet<>();
        set.add(7);
        set.add(5);
        set.add(9);
        set.add(2);
        set.add(5);
        set.add(3);

        set.forEach((e) -> System.out.print(e + " "));
    }
}
