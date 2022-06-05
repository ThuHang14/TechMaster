package ss4;

import java.util.Arrays;

public class thirdMaximumNumber_414 {
    public static void main(String[] args) {
        int[] a = {5, 2, 2};
        int[] b = {3, 3, 2, 1};
        int[] c = {2, 2, 2, 1};
        int[] d = {1, 2, 2, 5, 3, 5};

        System.out.println(thirdMax(a));
        System.out.println(thirdMax(b));
        System.out.println(thirdMax(c));
        System.out.println(thirdMax(d));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length >= 3) {
            int k = 2;
            for (int i = nums.length - 1, j = nums.length - 2; j >= 0; i--, j--) {
                if (nums[i] != nums[j]) {
                    k--;
                    if (k == 0) {
                        return nums[j];
                    }
                }

            }
            return nums[nums.length - 1];
        } else {
            return nums[nums.length - 1];
        }
    }
}
