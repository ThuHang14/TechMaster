package ints;

import java.util.Arrays;

public class spaceCom {
    public static void main(String[] args) { //729
        int [] a = new int[]{0,1,0,3,12};

moveZeroes(a);
    }
    public static void moveZeroes(int[] num) { //283
        int length = 0;
        int [] b = new int[num.length];
        for(int i = 0;i<num.length;i++){
            if(num[i] != 0){
                i = length +1;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
