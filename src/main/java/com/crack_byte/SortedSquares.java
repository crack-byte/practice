package com.crack_byte;

public class SortedSquares {
    public int[] sortSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos1 = 0;
        int pos2 = n - 1;
        int i = pos2;
        while (pos1 <= pos2) {
            int n1 = nums[pos1];
            int a1 = n1 * n1;
            int n2 = nums[pos2];
            int a2 = n2 * n2;
            if (a1 > a2) {
                result[i] = a1;
                pos1++;
            } else {
                result[i] = a2;
                pos2--;
            }
            i--;
        }
        return result;
    }

}
