package queue_stack;

import java.util.Stack;

public class b1544 {
//    public static void main(String[] args) {
//        System.out.println(makeGood("dD"));
//        System.out.println(makeGood("Dd"));
//    }

    public static String makeGood(String s) {
        if (s.length() == 1) {
            return s;
        }
        Stack<String> stack = new Stack<>();
        for (String c : s.split("")
        ) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (c.equals(c.toUpperCase()) && stack.peek().equals(c.toLowerCase())) {
                stack.pop();
            } else if (c.equals(c.toLowerCase()) && stack.peek().equals(c.toUpperCase())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        s = "";
        for (String a : stack
        ) {
            s += a;
        }
        return s;
    }
}
