package maps_;

import java.util.HashMap;
import java.util.Map;

public class b771 {
    public static void main(String[] args) {

    }
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> myMap = new HashMap<>();
        for (char x : stones.toCharArray()
             ) {
            myMap.put(x, myMap.getOrDefault(x, 0) + 1);
        }
        for (char c : jewels.toCharArray()
             ) {
            if(myMap.containsKey(c)){
                myMap.keySet();
            }
        }
        return 0;
    }
}
