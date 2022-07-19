package com.crack_byte;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0;
        int[] nums = new int[n];
        while (i < n) {
            nums[i++] = sc.nextInt();
        }
        --i;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, j = 0;
        while (j <= i) {
            max = Math.max(max, Math.max(nums[i], nums[j]));
            min = Math.min(min, Math.min(nums[i], nums[j]));
            --i;
            ++j;
        }
        System.out.print(max + " " + min);
    }
}
