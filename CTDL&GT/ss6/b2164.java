package ss6;

import java.util.*;

public class b2164 {
    public static void main(String[] args) {
        int[] nums = {36, 45, 32, 31, 15, 41, 9, 46, 36, 6, 15, 16, 33, 26, 27, 31, 44, 34};
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }

    public static int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        even.sort(Comparator.naturalOrder()); // giam
        odd.sort(Comparator.reverseOrder()); // tang
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(index);
            } else {
                nums[i] = odd.get(index);
                index++;
            }
        }
        return nums;
    }

    //c2
    public static int[] sortEven(int[] nums) {

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                pq1.add(nums[i]);
            } else {
                pq2.add(nums[i]);
            }
        }


        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr[i] = pq1.poll();
            } else {
                arr[i] = pq2.poll();
            }
        }

        return arr;
    }
}
