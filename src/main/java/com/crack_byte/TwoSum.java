package com.crack_byte;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * O(n) but fast
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>(numbers.length);
        int i = 0;
        while (i < numbers.length) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i + 1};
            } else {
                map.put(numbers[i], ++i);
            }
            i++;
        }
        return numbers;
    }

    /**
     * two pointer approach faster
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int c1 = numbers[low], c2 = numbers[high];
        while (c1 + c2 != target) {
            if (c1 + c2 < target) {
                low++;
            } else if (c1 + c2 > target) {
                high--;
            }
            c1 = numbers[low];
            c2 = numbers[high];
        }

        return new int[]{low + 1, high + 1};
    }
}
