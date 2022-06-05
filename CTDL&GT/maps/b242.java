package maps_;

import java.util.HashMap;
import java.util.Map;

public class b242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();
        for (char a : s.toCharArray()
        ) {
            mapS.put(a, mapS.getOrDefault(a, 0) + 1);
        }
        for (char a : t.toCharArray()
        ) {
            mapt.put(a, mapt.getOrDefault(a, 0) + 1);
        }
        return mapS.equals(mapt);
    }
}