package com.crack_byte;

public class MaximumSubarray {
    public static void main(String[] args) {
        int sum = maxSubArray(-2, -1);
        System.out.print(sum);
    }

    public static int maxSubArray(int... nums) {
        if (nums.length == 1) return nums[0];
        int i = 0;
        int max = nums[0], sum = 0;
        while (i <= nums.length - 1) {
            sum = sum + nums[i++];
            if (sum >= max) {
                max = sum;
            }
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
