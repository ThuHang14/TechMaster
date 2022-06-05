package test;

import java.util.Arrays;

public class ex283 {
    public static void main(String[] args) {
int [] a = {1,0,0,1,5,0};
moveZero(a);
        System.out.println(Arrays.toString(a));
    }
    public static void moveZero(int[] a){
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[k] = a[i];
                k++;
            }
        }
        for (; k < a.length; k++) {
            a[k] = 0;
        }
    }

    public static void moveZero2(int[] a){
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int t = a[k];
                a[k] = a[i];
                a[i] = t;
                k++;
            }
        }
    }
}
