package luyenTap;

import java.util.HashMap;
import java.util.Map;

public class b1128 { //tr //khoa
    /**
     * Domino
     */
    public static class Domino {
        public int x;
        public int y;

        public Domino(int[] arr) {
            x = arr[0];
            y = arr[1];
        }


        @Override
        public int hashCode() {
            if (x > y) {
                return x * 10 + y;
            }
            return y * 10 + x;
        }

        @Override
        public boolean equals(Object obj) {
            return this.hashCode() == obj.hashCode();
        }

    }

    public static int numEquivDominoPairs2(int[][] dominoes) {
        int count = 0;
        Map<Domino, Integer> map = new HashMap<>();

        for (int[] domino : dominoes) {
            Domino domino1 = new Domino(domino);

            if (map.containsKey(domino1)) {
                count += map.get(domino1);
            }
            map.put(domino1, map.getOrDefault(domino1, 0) + 1);
        }

        return count;
    }
//
    public static int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int[] domino : dominoes) {
            String s = convert(domino);
            map.put(s, map.getOrDefault(s, 0) + 1);
            count += map.get(s) - 1;
        }
        return count;
    }

    public static String convert(int[] domino) {
        if (domino[0] <= domino[1]) {
            return "" + domino[0] + domino[1];
        } else {
            return "" + domino[1] + domino[0];
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 },{ 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } };
        System.out.println( numEquivDominoPairs(arr));
    }
}
