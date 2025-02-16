package collectionexamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    public static void example() {
        Queue<String> names = new PriorityQueue<>();
        names.add("Sachith");
        names.add("Malith");
        names.add("Dinesh");
        names.add("Sachith");


        names.forEach(System.out::println);
        System.out.println("----------------");
        System.out.println("head: " + names.element());
        System.out.println("head: " + names.peek());
        names.forEach(System.out::println);
        names.remove();
        System.out.println("----------------");
        names.forEach(System.out::println);
        System.out.println("----------------");
        System.out.println(names.poll());
        System.out.println("----------------");
        names.forEach(System.out::println);
    }

    public static void example2() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Sachith");
        queue.add("Malith");
        queue.add("Dinesh");

        queue.forEach((e)->System.out.print(e+" "));
        System.out.println();
        System.out.println(queue.poll());
        queue.forEach((e)->System.out.print(e+" "));
        System.out.println();
        System.out.println(queue.peek());

        queue.forEach((e)->System.out.print(e+" "));
    }

}
