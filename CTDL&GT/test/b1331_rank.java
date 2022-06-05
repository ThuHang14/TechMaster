package test;

import java.util.*;

public class b1331_rank {
    public static void main(String[] args) {
        int a[] = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(a)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;
        if (arr.length == 1) {
            arr[0] = 1;
            return arr;
        }
        int[] rank = arr.clone();
        Arrays.sort(rank);
        Map<Integer, Integer> myMap = new HashMap<>();

        int i = 1;
        for (int a : rank
        ) {
            if (!myMap.containsKey(a)) {
                myMap.put(a, i++);
            }
        }
        i = 0;
        for (int a : arr
        ) {
            rank[i++] = myMap.get(a);
        }
        return rank;
    }
}
