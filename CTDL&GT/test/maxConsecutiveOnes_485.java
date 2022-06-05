package test;

public class maxConsecutiveOnes_485 {
    public static void main(String[] args) {
int [ ] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
int k = 0;
int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != 1) {
                count = 0;
            }
            if (nums[i] == 1) {
                count++;
            }

            if (count > k) {
                k = count;
            }
        }
        return k;
    }
}
