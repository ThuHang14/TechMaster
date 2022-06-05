package luyenTap;

import java.util.HashMap;
import java.util.Map;

public class b2068 {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char a : word1.toCharArray()
        ) {
            map1.put(a, map1.getOrDefault(a, 0) + 1);
        }
        for (char a : word2.toCharArray()
        ) {
            map2.put(a, map2.getOrDefault(a, 1) + 1);
        }

        for (var a : map1.entrySet()
        ) {
            if (a.getValue() > 3 && !map2.containsKey(a.getKey())) {
                return false;
            }
            try {
                if (a.getValue() - map2.get(a.getKey()) > 3 || map2.get(a.getKey()) - a.getValue() >3 ) {
                    return false;
                }
            } catch (Exception ignore) {
            }
        }
        for (var a : map2.entrySet()
        ) {
            if (a.getValue() > 3 && !map1.containsKey(a.getKey())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent(
                "bddhdfcdihfehbehfeiccehhchbibiggifcbgieedgfhggebcbeeddfdfiehcigdfcccdhgchbbfheddbdbiifeeiieg",
                "cdecdhhfgdieiifhhifffcgddeehgbciceggedbdggbigiieidgcceccgfhiecdefdhighbfdcdbgcfddeebbgibcihe"));
    }
}
