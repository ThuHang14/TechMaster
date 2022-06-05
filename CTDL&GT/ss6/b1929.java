package ss6;

import java.util.Arrays;

public class b1929 {
    public static void main(String[] args) {
int [] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] a = new int[length * 2];
        for (int i = 0; i < length; i++) {
            a[i] = nums[i];
            a[i+length] = nums[i];
        }
        return a;
    }
}
