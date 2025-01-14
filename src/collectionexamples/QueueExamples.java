package collectionexamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    public static void example(){
        Queue<String> names = new PriorityQueue<>();
        names.add("Sachith");
        names.add("Malith");
        names.add("Dinesh");
        names.add("Sachith");


        names.forEach(System.out::println);
        System.out.println("----------------");
        System.out.println("head: "+names.element());
        System.out.println("head: "+names.peek());
        names.forEach(System.out::println);
        names.remove();
        System.out.println("----------------");
        names.forEach(System.out::println);
        System.out.println("----------------");
        System.out.println(names.poll());
        System.out.println("----------------");
        names.forEach(System.out::println);
    }

}
