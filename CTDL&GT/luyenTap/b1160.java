package luyenTap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class b1160 {//tr

    public static void main(String[] args) {
        String[] a = {"hello","world","leetcode"};
       System.out.println(countCharacters(a, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        int sum = 0;
        for (String a : words
        ) {
            if (count(a, chars)) {
                sum += a.length();
            }
        }

        return sum;
    }

    public static boolean count(String w, String ch) {
        Map<Character, Integer> word = new HashMap<>();
        for (char c : w.toCharArray()
        ) {
            word.put(c, word.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> chars = new HashMap<>();
        for (char c : ch.toCharArray()
        ) {
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }
        int a = word.size();
        for (var ws : word.entrySet()
        ) {
            if (chars.containsKey(ws.getKey())) {
                if (ws.getValue() <= chars.get(ws.getKey())) {
                    a--;
                }
            }
        }
        return a == 0;
    }
}
