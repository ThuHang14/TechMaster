package test;

import java.util.*;

public class b929_email {
    public static void main(String[] args) {
        String[] s = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(s));
        System.out.println(convert("test.e.+.m.a..l+alex@leetcode.com"));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> mySet = new HashSet<>();
        for (String c : emails
        ) {
            mySet.add(convert(c));
        }
        return mySet.size();
    }

    public static String convert(String str) {
        char[] ch = new char[str.length()];
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()
        ) {

            list.add(c);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '+') {
                break;
            }
            if (list.get(i) != '.') {
                ch[i] = list.get(i);
            }
        }
        for (int i = list.size() - 1; i < list.size(); i--) {
            ch[i] = list.get(i);
            if (list.get(i) == '@') {
                break;
            }
        }
        StringBuilder s = new StringBuilder();
        for (char c : ch
        ) {
            if (c != 0) {
                s.append(c);
            }
        }
        return s.toString();
    }
}
