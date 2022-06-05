package test;

import java.util.Arrays;

public class twoSum_1 {
    public static void main(String[] args) {
        twoSum_1 twoSum1 = new twoSum_1();

        int[] arr = {1,6,5,4,2,2};
        System.out.println(Arrays.toString( twoSum1.twoSum(arr,3) ));

        int[] arr2 = {1,6,5,4,2,2};
        System.out.println(Arrays.toString( twoSum1.twoSum(arr2,6) ));
    }
    public int[] twoSum(int[] nums, int target) {
int[] result = new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++){
                if(i != j){
                    if (nums[i] + nums[j] == target){
                        result[0] = j;
                        result[1] = i;
                    }
                }
            }
        }
        return result;
    }
}
