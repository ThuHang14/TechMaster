package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class b859_buddy {
    public static void main(String[] args) {
        System.out.println(buddyStrings("abc", "bac"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length() || s.length() == 0 || goal.length() == 0) return false;

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char a : s.toCharArray()
            ) {
                set.add(a);
            }
            return set.size() < s.length();
        } else {
            String a = "";
            String b = "";
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    a = s.charAt(i) + "" + goal.charAt(i);
                    count = i;
                    break;
                }
            }
            for (int i = count + 1; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    b += goal.charAt(i) + "" + s.charAt(i);
                }
            }

            return a.equals(b);
        }
    }
}
