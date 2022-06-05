package hash;

import java.util.TreeSet;

public class b268 {
//    public static void main(String[] args) {
//        int[] a = {9,6,4,8,2,3,5,7,0,1};
//        System.out.println( missingNumber(a));
//    }
    public static int missingNumber(int[] nums) {
        if(nums.length <=1){
            if(nums[0] ==0) return 1;
            else return 0;
        }
        TreeSet<Integer> setNum = new TreeSet<>();
        for (int s : nums
        ) {
            setNum.add(s);
        }
        if(setNum.first() != 0) return 0;
        while (setNum.size()!= 1){
            int miss =setNum.pollFirst()+1;
            if(miss!= setNum.first()){
                return miss;
            }
        }
        return nums.length;
    }
}
