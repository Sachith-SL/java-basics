package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void example(){
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads in the pool

        for (int i = 1; i <= 5; i++) {
            executor.execute(new Task(i)); // Submitting tasks to executor
        }

        executor.shutdown(); // Prevents new tasks from being submitted

    }
}
