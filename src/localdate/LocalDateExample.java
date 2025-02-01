package localdate;

import java.time.LocalDate;

public class LocalDateExample {
    public static void example() {
        LocalDate date = LocalDate.of(2025, 1, 10); // Creating a specific date
        System.out.println(date); // Output: 2025-01-10

        LocalDate today = LocalDate.now(); // Get today's date
        System.out.println(today); // Output: 2025-01-10 (or the current date)

        // Adding days
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow); // Output: 2025-01-11

        // Checking if a date is before another
        boolean isBefore = today.isBefore(LocalDate.of(2025, 1, 15));
        System.out.println(isBefore); // Output: true
    }
}
