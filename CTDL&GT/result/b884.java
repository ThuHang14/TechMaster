package result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b884 {
    public static void main(String[] args) {
        uncommonFromSentences("this apple is sour", "this apple is sweet");
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> myMap = new HashMap<>();

        for (String a : s1.split(" ")
        ) {
            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
        }
        for (String a : s2.split(" ")
        ) {
            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
        }
        List<String> myList = new ArrayList<>();
        for (var a : myMap.entrySet()
        ) {
            if (a.getValue() == 1) {
                myList.add(a.getKey());
            }
        }
        return myList.toArray(new String[0]);
    }
}
