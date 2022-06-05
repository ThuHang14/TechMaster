package queue_stack;

import java.util.Stack;

public class b20 {
//    public static void main(String[] args) {
//        System.out.println(isValid("{[([()])]}"));//true
//        System.out.println(isValid("(]"));//false
//    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()
        ) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() == '(' && c == ')') {
                stack.pop();
            } else if (stack.peek() == '[' && c == ']') {
                stack.pop();
            } else if (stack.peek() == '{' && c == '}') {
                stack.pop();
            } else stack.push(c);
        }

        return stack.isEmpty();
    }
}
