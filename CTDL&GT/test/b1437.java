package test;

import java.util.HashSet;
import java.util.Set;

public class b1437 {
    public boolean kLengthApart(int[] nums, int k) {
        Set<Integer> mySet = new HashSet<>();
        for (int a : mySet
        ) {
            mySet.add(a);
        }
        if (mySet.size() == 1) {
            if (mySet.contains(0)) {
                return true;
            } else if (mySet.contains(1) && k == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            int count = nums.length;
            int min = nums.length;
            for (int a : nums
            ) {
                if (a == 1) {
                    min = Math.min(count, min);
                    count = 0;
                } else if (a == 0) {
                    count++;
                }
            }
            return min == k;
        }
    }
    public boolean kLengthApart2(int[] nums, int k) {
        int count = k;
        for (int num : nums) {
            if (num == 1) {
                if (count < k) {
                    return false;
                }
                count = 0;

            } else {
                ++count;
            }
        }
        return true;
    }
}
