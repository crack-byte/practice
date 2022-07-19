package com.crack_byte;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (i < s1.length()) {
            char c = s1.charAt(i++);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        i = 0;
        Map<Character, Integer> map2 = new HashMap<>();
        while (i < s2.length()) {
            char c = s2.charAt(i++);
            if (map.containsKey(c)) {
                map2.put(c, map2.containsKey(c) ? map2.get(c) + 1 : 1);
                if (map2.equals(map)) return true;
            } else {
                map2.clear();
            }
        }
        return map2.equals(map);

    }
}
