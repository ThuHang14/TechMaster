package test;

import java.util.*;

public class b2248 {
    public static void main(String[] args) {
        int[][] nums = {{3, 4, 5, 6}, {1, 2, 3, 4}};
        System.out.println(intersection(nums));
    }

    public static List<Integer> intersection(int[][] nums) {
        List<Integer> inter = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int[] a : nums
        ) {
            convert(a, myMap);
        }
        for (var a : myMap.entrySet()
        ) {
            if (a.getValue() == nums.length) {
                inter.add(a.getKey());
            }
        }
        inter.sort(Comparator.naturalOrder());
        return inter;
    }

    public static Map<Integer, Integer> convert(int[] a, Map<Integer, Integer> mymap) {
        Set<Integer> mySet = new HashSet<>();
        {
            for (int b : a
            ) {
                mySet.add(b);

            }
        }
        for (int b : mySet
        ) {
            mymap.put(b, mymap.getOrDefault(b, 0) + 1);
        }

        return mymap;
    }
}
