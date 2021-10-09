package com.crack_byte;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        if (k > len) k = k % len;
        int[] temp = new int[len];
        if (len > 1)
            for (int i = 0; i < len ; i++) {
                int diff = i - k;
                temp[i] = nums[i];
                if (diff < 0) {
                    nums[i] = nums[len + diff];
                } else {
                    if (i >= k) {
                        nums[i] = temp[diff];
                    } else {
                        nums[i] = nums[diff];
                    }
                }
            }
    }
}

