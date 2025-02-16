package collectionexamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void example() {
        Map<Employee, String> map = new HashMap<>();
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Alice", 101);

        map.put(e1, "Developer");
        System.out.println("Value for e1: " + map.get(e1)); // ✅ Works

        System.out.println("Value for e2: " + map.get(e2)); // ❌ Returns null
    }
}
