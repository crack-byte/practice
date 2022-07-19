package com.crack_byte;

import java.util.Scanner;

public class RotateArray {

    /**
     * rotating array by k times
     * TC: O(n)
     * SC: O(n)
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int len = nums.length, diff;
        if (k > len) k = k % len;
        int[] temp = new int[len];
        if (len > 1)
            for (int i = 0; i < len; i++) {
                diff = i - k;
                temp[i] = nums[i];
                nums[i] = (diff < 0) ? nums[len + diff] : ((i >= k) ? temp[diff] : nums[diff]);
            }
    }

    /**
     * rotating array by k times
     * TC: O(n)
     * SC: O(1)
     *
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        int len = nums.length;
        if (len > 1) {
            k = k % len;
            reverse(nums, 0, --len);
            reverse(nums, 0, k - 1);
            reverse(nums, k, len);
        }
    }

    public static void reverse(int[] arr, int low, int high) {
        while (high > low) {
            int t = arr[high];
            arr[high] = arr[low];
            arr[low] = t;
            --high;
            ++low;
        }
    }

    //    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3,
//                4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8,
//                9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("before : " + Arrays.toString(arr));
//        long l = System.nanoTime();
//        rotate(arr, 3);
//        System.out.println("nano time :" + (System.nanoTime() - l));
//        System.out.println("before : " + Arrays.toString(arr));
//        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2,
//                3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7,
//                8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("before : " + Arrays.toString(arr));
//        l = System.nanoTime();
//        rotate1(arr, 3);
//        System.out.println("nano time :" + (System.nanoTime() - l));
//        System.out.println("before : " + Arrays.toString(arr));
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0;
        int[] nums = new int[n];
        while (i < n) {
            nums[i++] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (n > 1) {
            k = k % n;
            reverse(nums, 0, --n);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n);
        }
        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

