package com.crack_byte;

import java.util.Arrays;

public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {
        // test 1
        //[4,9,5]
        //[9,4,9,8,4]
        // test2
        //[61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81]
        //[5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48]
        // test3
        //[4,3,9,3,1,9,7,6,9,7]
        //[5,0,8]
        int[] nums1 = {4, 3, 9, 3, 1, 9, 7, 6, 9, 7};
        int[] nums2 = {5, 0, 8};
        intersect(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, c = 0;
        int[] nums = new int[Math.min(nums1.length, nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums[c++] = nums1[i];
                ++i;
                ++j;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                ++i;
            }
        }
        int[] n = new int[c];
        for (int num : nums) {
            if (c == 0) break;
            n[--c] = num;
        }
        return n;
    }

}
