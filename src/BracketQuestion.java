import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BracketQuestion {
    public static boolean check(String s) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                charStack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (charStack.isEmpty())
                    return false;
                char top = charStack.pop();
                if (
                        ch == '}' && top != '{' ||
                                ch == '[' && top != ']' ||
                                ch == '(' && top != ')'
                ) return false;

            }

        }

        return charStack.isEmpty();
    }
}
