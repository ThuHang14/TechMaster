package maps_;

import java.util.Map;
import java.util.TreeMap;

public class b205 {
//    public static void main(String[] args) {
//        System.out.println(isIsomorphic("badc", "baba"));
//    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> myMap = new TreeMap<>();
        char[] ch = t.toCharArray();
        int i = -1;
        for (char a : s.toCharArray()
        ) {
            i++;
            if (myMap.containsKey(a)) {
                if (myMap.get(a) != ch[i]) return false;
            } else {
                if (myMap.containsValue(ch[i])) return false;
                myMap.put(a, ch[i]);
            }
        }
        return true;
    }
}
