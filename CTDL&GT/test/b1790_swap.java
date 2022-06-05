package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class b1790_swap {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                list1.add(s1.charAt(i));
            }
        }
        if (list1.size() != 2) return false;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != s1.charAt(i)) {
                list2.add(s2.charAt(i));
            }
        }
        if (list2.size() != 2) return false;

        return list1.get(0) == list2.get(1) && list1.get(1) == list2.get(0);
    }

    public static void main(String[] args) {
        areAlmostEqual2("bank","kanb");
    }
    public static boolean areAlmostEqual2(String s1, String s2) {
        if(s1.equals(s2)) return true;
        String a = "";
        String b = "";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                a = s1.charAt(i) + "" + s2.charAt(i);
                count = i;
                break;
            }
        }
        for (int i = count+1; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                b += s2.charAt(i) + "" + s1.charAt(i);
            }
        }
        return a.equals(b);
    }
}
