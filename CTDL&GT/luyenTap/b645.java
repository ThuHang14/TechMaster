package luyenTap;

import java.util.HashSet;
import java.util.Set;

public class b645 {
    public int[] findErrorNums(int[] nums) {

        int[] a = new int[2];
        Set<Integer> mySet = new HashSet<>();
        for (int s : nums
        ) {
            if (!mySet.add(s)) {
                a[0] = s;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!mySet.contains(i)) {
                a[1] = i;
            }
        }
        return a;
    }
}
