package com.crack_byte;

public class AntiDiagonals {
    public static void main(String[] args) {
        diagonal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    public static int[][] diagonal(int[][] A) {
        int[][] arr = new int[(2 * A.length) - 1][A.length];
        arr[0][0] = A[0][0];
        arr[2 * A.length - 2][0] = A[A.length - 1][A.length - 1];
        int i = 1;
        while (i < 2 * A.length - 2) {
            int j = 0;
            if (i < A.length) {
                int x = 0, y = i;
                while (y >= 0) {
                    arr[i][j++] = A[x++][y--];
                }
            } else {
                int x = i - A.length + 1, y = A.length - 1;
                while (x < A.length) {
                    arr[i][j++] = A[x++][y--];
                }
            }
            i++;
        }
        return arr;
    }
}
