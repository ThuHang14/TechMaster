package test;

public class b1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] a : grid
        ) {
            for (int b : a
            ) {
                if (b < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
