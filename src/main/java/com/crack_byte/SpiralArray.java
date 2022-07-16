package com.crack_byte;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] m = generateMatrix(5);
    }

    public static int[][] generateMatrix(int A) {
        int[][] arr = new int[A][A];
        int c = 1;
        for (int i = 0; i < (A) / 2; i++) {
            for (int t = i; t < A - 1 - i; t++) {
                arr[i][t] = c++;
            }
            for (int r = i; r < A - 1 - i; r++) {
                arr[r][A - 1 - i] = c++;
            }
            for (int b = A - 1 - i; b > i; b--) {
                arr[A - 1 - i][b] = c++;
            }
            for (int l = A - 1 - i; l > i; l--) {
                arr[l][i] = c++;
            }
        }
        if ((A & 1) == 1) {
            arr[A / 2][A / 2] = c;
        }
        return arr;
    }
}
