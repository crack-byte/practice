package com.crack_byte;

import java.util.Arrays;

public class RotateMatrixClockWise {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solve(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static void solve(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int s = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = s;
            }
            reverse(A[i]);
        }
    }

    static void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int s = nums[i];
            nums[i] = nums[j];
            nums[j] = s;
            ++i;
            --j;
        }
    }
}
