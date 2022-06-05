package test;

import java.util.Arrays;

public class plusOne_66 {
    public static void main(String[] args) {
int a[] = {3,9,9,4};
plus(a);
        System.out.println((Arrays.toString(a)));
    }
    public static int[] plus(int[] a) {
        int n = a.length;
        for(int i = n - 1; i >= 0; i --) {
            if(a[i] < 9) {
                a[i] ++;
                return a;
            } else {
                a[i] = 0;
            }
        }
        return a;
    }
}
