package test;

public class b674 {
    public static void main(String[] args) {
        int [] a = {1,3,3,5,4,7};
        System.out.println(findLengthOfLCIS(a));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (result < count) {
                result = count;
            }
            try {
                if (nums[i] >= nums[i+1]) {
                    count = 0;
                }
            } catch (Exception ignore) {
            }

        }
        return result;
    }
}
