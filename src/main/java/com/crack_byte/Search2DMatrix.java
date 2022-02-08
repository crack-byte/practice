package com.crack_byte;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1}};
        System.out.println(searchMatrix(nums, 1));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length, c = matrix[0].length, i = 0, j = 0;
        while (i < r) {
            if (matrix[i][c - 1] >= target) {
                return search(matrix, i, c, target);
            }
            ++i;
        }
        return false;
    }

    public static boolean search(int[][] nums, int l, int r, int target) {
        int pos1 = 0;
        int pos2 = r - 1;
        while (true) {
            int half = pos1 + ((pos2 - pos1) / 2);
            int midValue = nums[l][half];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                pos1 = half + 1;
            } else {
                pos2 = half - 1;
            }
            if (pos1 > pos2)
                return false;
        }
    }
}
