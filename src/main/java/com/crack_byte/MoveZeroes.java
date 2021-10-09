package com.crack_byte;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int temp = 0;
        int len = nums.length;
        while (i < len) {
            if (nums[i] == 0) {
                i++;
                continue;
            }
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j++;
        }
    }
}
