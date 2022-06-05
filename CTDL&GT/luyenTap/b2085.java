package luyenTap;

import java.util.HashMap;
import java.util.Map;

public class b2085 {
    public static void main(String[] args) {
        String[] a = {"leetcode","is","amazing","as","is"};
        String[] b = {"amazing","leetcode","is"};
        System.out.println(countWords(a,b));
    }
    public static int countWords(String[] words1, String[] words2) {
        int count = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : words1
        ) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : words2
        ) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        for (var s : map2.entrySet()
        ) {
            if (map1.containsKey(s.getKey())) {
                if (map1.get(s.getKey()) == s.getValue() && s.getValue() == 1) {
                    count++;
                }
            }
        }
        return count;
    }

}
