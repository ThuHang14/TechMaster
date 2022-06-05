package ss4;

import java.util.Arrays;

public class majorityElement_169 {
    public static void main(String[] args) {
        int a[] = {3, 3, 4};
        int b[] = {-1, 1, 1, 1, 2, 1};
        System.out.println(majorityElement(a));
        System.out.println(majorityElement(b));
    }

    public static int majorityElement(int[] num) {
        int nums[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0) {
                nums[i] = num[i];
            }
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int arr[] = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int t = arr[0];
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                t = i;
            }
        }
        return t;
    }
}
