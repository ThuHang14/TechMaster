package luyenTap;

import java.util.*;

public class b2032 {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> twoOut = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        set = add(nums1);
        for (int a : add(nums2)
        ) {
            if (!set.add(a) && !twoOut.contains(a)) {
                twoOut.add(a);
            }
        }
        for (int a : add(nums3)
        ) {
            if (!set.add(a) && !twoOut.contains(a)) {
                twoOut.add(a);
            }
        }
        return twoOut;
    }

    public static Set<Integer> add(int[] nums1) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums1
        ) {
            set.add(a);
        }
        return set;
    }

    public static void main(String[] args) {
        int[] a = {3, 1};
        int[] s = {2, 3};
        int[] d = {2, 1};
        List<int[]> numsList = Arrays.asList(a, s, d);
        System.out.println(numsList);
       // System.out.println(twoOutOfThree(a, s, d));
    }
}
