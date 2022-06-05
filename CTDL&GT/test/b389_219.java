package test;

import java.util.HashMap;
import java.util.Map;

public class b389_219 {
    public static void main(String[] args) {
        findTheDifference("abccd", "aecbcd");
        int[] a = {1, 0,1,1};
        containsNearbyDuplicate_219(a, 1);
    }

    public static char findTheDifference(String s, String t) {
        int i;
        if (s.length() == 0) return t.charAt(0);
        else {
            i = 0;
            for (char a : s.toCharArray()
            ) {
                i += a;
            }
            for (char a : t.toCharArray()
            ) {
                i -= a;
            }
        }
        return (char) Math.abs(i);
    }

    public static boolean containsNearbyDuplicate_219(int[] nums, int k) {
        if (nums.length == 1) return false;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) return true;

            map.put(nums[i], i);
        }

        return false;
    }
}
