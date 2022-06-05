package test;

import java.util.Arrays;

public class mergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        nums1.length += nums2.length;
        for (int i = 0; i <n ; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int [] nums1 = {1};
        int m = 1;
        int [] nums2 = {};
        int n = 0;
merge( nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        int [] nums12 = {1,3,2,0,0};
        int m2 =3;
        int [] nums22 = {4,5};
        int n2 = 2;
        merge( nums12, m2, nums22, n2);
        System.out.println(Arrays.toString(nums12));

    }
}
