package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class b349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();
        for (int s : nums1
        ) {
            mySet.add(s);
        }
        for (int s : nums2
        ) {
            if (mySet.contains(s) && !list.contains(s)) {
                list.add(s);
            }
        }

        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}
