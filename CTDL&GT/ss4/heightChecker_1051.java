package ss4;

import java.util.Arrays;

public class heightChecker_1051 {
    public static void main(String[] args) {
        int a[] = {1, 1, 4, 2, 1, 3};
        int b[] = {1, 2, 3, 4, 5};
        System.out.println(heightChecker(a));
        System.out.println(heightChecker(b));
    }

    public static int heightChecker(int[] heights) {
        int[] a = heights.clone();
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (a[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
