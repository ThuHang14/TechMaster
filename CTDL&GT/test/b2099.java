package test;

import java.util.*;

public class b2099 {
    public static void main(String[] args) {
        int[] a = {-16, -13, 8, 16, 35, -17, 30, -8, 34, -2, -29, -35, 15, 13, -30, -34, 6, 15, 28, -23, 34, 28, -24, 15, -17, 10, 31, 32, -3, -36, 19, 31, -5, -21, -33, -18, -23, -37, -15, 12, -28, -40, 1, 38, 38, -38, 33, -35, -28, -40, 4, -15, -29, -33, -18, -9, -29, 20, 1, 36, -8, 23, -34, 16, -7, 13, 39, 38, 7, -7, -10, 30, 9, 26, 27, -37, -18, -25, 14, -36, 23, 28, -15, 35, -9, 1};
        System.out.println(Arrays.toString(maxSubsequence2(a, 8)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        if (k == nums.length) return nums;
        List<Integer> myList = new ArrayList<>();
        for (int a : nums
        ) {
            myList.add(a);
        }
        myList.sort(Comparator.reverseOrder());
        List<Integer> listMax = new ArrayList<>();

        int[] a = new int[k];
        for (int i = 0; i < a.length; i++) {
            listMax.add(myList.get(i));
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (listMax.contains(nums[i])) {
                a[count++] = nums[i];
                listMax.remove(listMax.indexOf(nums[i]));
                if (count == k) break;
            }
        }
        return a;
    }

    public static int[] maxSubsequence2(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        for (int i = 0; i < nums.length; i++) {
            q.offer(new int[]{nums[i], i});
            if (q.size() > k) {
                q.poll();
            }
        }

        Set<Integer> index = new HashSet<>();

        while (!q.isEmpty()) {
            int[] top = q.poll();
            index.add(top[1]);
        }

        int[] result = new int[k];

        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index.contains(i)) {
                result[p] = nums[i];
                ++p;
            }
        }

        return result;
    }
}
