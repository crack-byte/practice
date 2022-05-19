package com.crack_byte;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdabcdbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int max = 0,curlen = 1,spli_at = 0;
        for (int i = 1; i < s.length(); i++) {
            int j = spli_at;
            while (j < i) {
                if (s.charAt(i) == s.charAt(j)) break;
                j++;
            }
            if (j < i) {
                spli_at = j + 1;
                curlen = i - j;
            } else {
                curlen++;
            }
            if (curlen > max) max = curlen;
        }
        return max;
    }
}
