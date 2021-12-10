package com.crack_byte;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
//        int[] nums1 = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
//        int[] nums2 = {1, 2, 2};
        int[] nums1 = {0, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 3, 4, 5};
//        int[] nums1 = {2, 0};
//        int[] nums2 = {1};
        merge(nums1, 0, nums2, 5);
        System.out.print(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m > 0 ? m - 1 : 0, j = n - 1, pos = m;
        if (n != 0) {
            while (j >= 0) {
                while (i >= 0 && nums1[i] > nums2[j]) {
                    if (pos != 0) pos -= 1;
                    --i;
                }
                shift(nums1, pos, nums2[j--]);
            }
        }
    }

    private static void shift(int[] nums, int i, int value) {
        int t = 0;
        boolean bool = true;
        while (i < nums.length) {
            if (bool) {
                t = nums[i];
                bool = false;
                nums[i] = value;
            } else {
                int t1 = nums[i];
                nums[i] = t;
                t = t1;
            }
            ++i;

        }
    }
}
