package ints;

import java.util.Arrays;

public class stringQuiz {
    public static void main(String[] args) {
        // & false
        // || true
int [] a = {8,4,5,0,0,0,0,7};
      //  {1,0,2,3,0,4,5,0};
duplicateZeros(a);
        System.out.println(Arrays.toString(a));

        int [] a2 = {0,0,0,0,0,0,0};
        duplicateZeros(a2);
        System.out.println(Arrays.toString(a2));
    }
    public static void duplicateZeros(int[] arr) {
        if (Arrays.stream(arr).sum() == 0) {
            return;
        } else {
            int[] arr2 = new int[arr.length+2];
            for (int i = 0, k = 0; k < arr.length; i++, k++) {
                if (arr[i] == 0) {
                    arr2[k] = arr[i];
                    k++;
                    arr2[k] = 0;
                } else {
                    arr2[k] = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr2[i];
            }
        }
    }
}
