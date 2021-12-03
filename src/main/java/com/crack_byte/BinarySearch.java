package com.crack_byte;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int pos1 = 0;
        int pos2 = nums.length - 1;
        while (true) {
            int half = pos1 + ((pos2 - pos1) / 2);
            int midValue = nums[half];
            if (midValue == target) {
                return half;
            } else if (midValue < target) {
                pos1 = half + 1;
            } else {
                pos2 = half - 1;
            }
             //agsdiugaskdgasgd
            if (pos1 > pos2)
                return -1;
        }
    }
}
