package ints;

import java.util.Arrays;

public class B1636 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3};
        int[] b = {2, 3, 1, 3, 2};
        int[] c = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(Arrays.toString(frequencySort(a)));
        System.out.println(Arrays.toString(frequencySort(b)));
        System.out.println(Arrays.toString(frequencySort(c)));
    }

    public static int[] frequencySort(int[] num) {
        sortDESC(num);
        int a[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            a[i] = num[i] + 100;
        }
        int k[] = new int[201]; //Constraints:1 <= num.length <= 100 && -100 <= num[i] <= 100
        int arr_k[] = new int[num.length];
        //count
        for (int i = 0; i < a.length; i++) {
            k[a[i]]++;
        }
        for (int i = 0; i < a.length; i++) {
            arr_k[i] = k[a[i]];
        }
        //sort selection
        for (int i = 0; i < arr_k.length; i++) {
            int minRight = i;
            for (int j = i + 1; j < arr_k.length; j++) {
                if (arr_k[minRight] > arr_k[j]) {
                    minRight = j;
                }
            }
            if (minRight != i) {
                int t = arr_k[i];
                arr_k[i] = arr_k[minRight];
                arr_k[minRight] = t;

                int t2 = num[i];
                num[i] = num[minRight];
                num[minRight] = t2;

            }
        }
        return num;
    }

    public static void sortDESC(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] < arr[j]) {
                    temp = j;
                }
            }
            if (temp != i) {
                int t = arr[i];
                arr[i] = arr[temp];
                arr[temp] = t;
            }
        }
    }
}
