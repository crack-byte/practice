package com.crack_byte;

public class ReverseString {
    /**
     * half way approach
     *
     * @param s
     */
    public static void reverseString(char[] s) {
        int length = s.length;
        int len = (length / 2) - 1;
        while (len >= 0) {
            char c = s[len];
            s[len] = s[length - len - 1];
            s[length - len - 1] = c;
            len--;
        }
    }

    /**
     * two pointer approach
     *
     * @param s
     */
    public static void reverseString2(char[] s) {
        int low = 0, high = s.length - 1;
        while (high > low) {
            char c = s[high];
            s[high] = s[low];
            s[low] = c;
            high--;
            low++;
        }
    }
}
