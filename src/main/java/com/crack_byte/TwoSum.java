package com.crack_byte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * O(n) but fast
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int i = 0;
        while (i < nums.length) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i])-1, i };
            }
            map.put(nums[i], ++i);

        }
        return  nums;
    }

    /**
     * two pointer approach faster
     * Note : currently has some issues with it nmeed to fix
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int target, int... nums) {
        int low = 0;
        int high = nums.length - 1;
        int c1 = nums[low], c2 = nums[high];
        while (c1 + c2 != target) {
            if (Math.abs(c1 + c2) < Math.abs(target)) {
                low++;
            } else if (Math.abs(c1 + c2) > Math.abs(target)) {
                high--;
            }
            c1 = nums[low];
            c2 = nums[high];
        }
        return new int[]{low , high};
    }

    public static void main(String[] args) {
        int[] sum = twoSum2(200, 150,24,79,50,88,345,3);
        System.out.print(Arrays.toString(sum));
    }
}
