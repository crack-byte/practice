package com.crack_byte;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int t = lengthOfLongestSubstring("abcabcbb");
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        char[] c = s.toCharArray();
        int max = 0;
        int curlen = 1;
        int spli_at = 0;

        for (int i = 1; i < c.length; i++) {
            int j = spli_at;
            while (j < i) {
                if (c[i] == c[j]) break;
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
