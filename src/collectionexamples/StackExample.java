package collectionexamples;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackExample {
    public static void example(){
        Deque<String> stack = new LinkedList<>();

        stack.push("Sachith");
        stack.push("Malith");
        stack.push("Dinesh");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
