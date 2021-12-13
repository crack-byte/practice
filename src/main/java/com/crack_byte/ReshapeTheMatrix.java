package com.crack_byte;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}};
        int[][] ints = matrixReshape(nums, 1, 1);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length, columns = mat[0].length, i = 0, j = 0, k = 0;
        int[] nums = new int[rows * columns];
        if (nums.length < (r * c) || nums.length > (r * c)) {
            return mat;
        }
        while (i < nums.length) {
            if (k == columns) {
                ++j;
                k = 0;
            }
            nums[i] = mat[j][k++];
            ++i;
        }
        mat = new int[r][c];
        i = 0;
        j = 0;
        k = 0;
        while (i < nums.length) {
            if (k == c) {
                ++j;
                k = 0;
            }
            mat[j][k++] = nums[i];
            ++i;
        }
        return mat;
    }
}
