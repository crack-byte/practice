package com.crack_byte;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        int n = 'a';
        System.out.print(canConstruct1("aa", "aba"));
    }

    // using hash map easy solution
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        int len = magazine.length() - 1;
        while (len >= 0) {
            char key = magazine.charAt(len);
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
            --len;
        }
        len = ransomNote.length() - 1;
        while (len >= 0) {
            char c = ransomNote.charAt(len);
            if (!map.containsKey(c)) {
                return false;
            } else {
                int value = map.get(c) - 1;
                if (value == 0) {
                    map.remove(c);
                } else {
                    map.put(c, value);
                }
            }
            --len;
        }
        return true;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] nums = new int[26];
        int i = 0;
        while (i < ransomNote.length()) {
            char c = ransomNote.charAt(i++);
            int pos = magazine.indexOf(c, nums[c - 97]);
            if (pos == -1) {
                return false;
            }
            nums[c - 97] = ++pos;
        }
        return true;
    }

}
