package ss4;

import java.util.Arrays;

public class sortArrayByParity_905 {

    public static void main(String[] args) {
        int[] a = {3,1,2,4};
        int[] b = {0};
        sortArrayByParity(a);
        sortArrayByParity(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0, k = 0, j = nums.length - 1; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[k] = nums[i];
                k++;
            } else {
                arr[j] = nums[i];
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}
