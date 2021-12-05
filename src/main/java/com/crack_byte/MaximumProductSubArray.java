package com.crack_byte;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        int i = maxProduct(-3, 0, 1, -2);
        System.out.println(i);
    }

    public static int maxProduct(int... nums) {
        if (nums.length == 1) return nums[0];
        int i = 0, j = nums.length - 1;
        int max = 0;
        int pos1 = 0, pos2 = 0;
        while (i <= nums.length - 1) {
            pos1 = (pos1 == 0 ? 1 : pos1) * nums[i];
            max = Math.max(max, pos1);
            pos2 = (pos2 == 0 ? 1 : pos2) * nums[j];
            max = Math.max(max, pos2);
            --j;
            ++i;
        }
        return max;
    }

}
