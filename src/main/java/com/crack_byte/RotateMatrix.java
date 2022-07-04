package com.crack_byte;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[] a = {6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54,
                67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
        int[] b = {88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};
        int[][] solve = solve(a, b);
        solve = solve;
    }

    public static int[][] solve(int[] A, int[] B) {
        int i = 0, n = A.length, prevK = -1;
        int[][] r = new int[B.length][n];
        while (i < B.length) {
            int k = B[i] % n;
            if (n > 1 && k > 0) {
                if (prevK < 0) {
                    reverse(A, 0, n - 1);
                    reverse(A, 0, n - k -1 );
                    reverse(A, n - k , n - 1);
                } else {
                    if (prevK < k) {
                        reverse(A, 0, n - 1);
                        reverse(A, 0, n - (k - prevK)-1);
                        reverse(A, n - (k - prevK) , n - 1);
                    } else {
                        reverse(A, 0, n - 1);
                        reverse(A, 0, (prevK - k) - 1);
                        reverse(A, (prevK - k), n - 1);
                    }
                }
            }
            prevK = k;
            r[i++] = Arrays.copyOf(A, n);
        }
        return r;
    }

    private static void reverse(int[] arr, int l, int h) {
        while (l < h) {
            if (arr[l] != arr[h]) {
                int t = arr[h];
                arr[h] = arr[l];
                arr[l] = t;
            }
            --h;
            ++l;
        }
    }


}
