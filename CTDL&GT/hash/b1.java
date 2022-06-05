package hash;

import java.util.*;

public class b1 {
    public static void main(String[] args) { //9
        int[] a = {3,2,4}; //-2 -6 7 2
        System.out.println(Arrays.toString(twoSum(a, 6))); // 3 4 2
    }

    public static int[] twoSum(int[] nums, int target) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int s : nums
        ) {
            if (target - s < 0) {
                break;
            }
            set.add(target - s);
        }
        int[] a = new int[2];
        int b = 0;
        for (int s : set
        ) {
            for (int i = 0; i < nums.length; i++) {
                if (s == nums[i]) {
                    a[b++] = i;
                    if (b > 1) return a;
                }
            }
        }
        return a;
    }
}
