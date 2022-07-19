package com.crack_byte;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] a = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        int[][] b = {{7, 10}, {3, 10}, {3, 5}, {1, 10}, {1, 1}, {10, 10}};
        long[] res = rangeSum(a, b);
        for (long re : res) {
            System.out.println(re);
        }
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        long[] r = new long[A.length];
        r[0] = A[0];
        for (int i = 1; i < r.length; i++) {
            r[i] = A[i] + r[i - 1];
        }
        long[] r1 = new long[B.length];
        for (int i = 0; i < r1.length; i++) {
            if (B[i][0] >= 2) {
                r1[i] = r[B[i][1] - 1] - r[B[i][0] - 2];
            } else {
                r1[i] = r[B[i][1] - 1];
            }

        }
        return r1;
    }
}
