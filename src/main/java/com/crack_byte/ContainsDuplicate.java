package com.crack_byte;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        boolean b = containsDuplicate(1, 2, 3, 4, 1, 4, 3, 5, 6, 2, 1);
    }

    // easy solution but slow
    public static boolean containsDuplicate(int... nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
