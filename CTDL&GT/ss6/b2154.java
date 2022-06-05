package ss6;

public class b2154 {
    public static void main(String[] args) {
        int[] nums = {8, 19, 4, 2, 15, 3};
        System.out.println(findFinalValue(nums, 2));
    }

    public static int findFinalValue(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                original *= 2;
              return findFinalValue(nums, original);
            }
        }
        return original;
    }}
