package queue_stack;

import java.util.Stack;

public class b844 {
    //    public static void main(String[] args) {
//        System.out.println(backspaceCompare("a##c#","a###"));
//    }
    public static boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }

    public static Stack<String> compare(String s) {
        Stack<String> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars
        ) {
            if (c != '#') {
                stack.push(String.valueOf(c));
            } else {
                try {
                    stack.pop();
                } catch (Exception ignored) {
                }
            }
        }
        return stack;
    }
}
