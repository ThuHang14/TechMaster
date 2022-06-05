package result;

import java.util.HashMap;
import java.util.Map;

public class b2206 {
    public boolean divideArray(int[] nums) {
        int n = nums.length / 2;
        int count = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int a : nums
        ) {
            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
        }
        for (var a : myMap.entrySet()
        ) {
            if (a.getValue() % 2 == 0) {
                count += a.getValue();
            }
        }
        return count / 2 == n;
    }
}
