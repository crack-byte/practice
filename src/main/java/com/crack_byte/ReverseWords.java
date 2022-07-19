package com.crack_byte;

public class ReverseWords {
    public static String reverseWords(String s) {
        return iterate(s.toCharArray());
    }

    public static String iterate(char[] chars) {
        int len = chars.length;
        int low = 0;
        int high = 0;
        while (high < len) {
            if (chars[high] == ' ' || high == len - 1) {
                if (high == len - 1) {
                    reverseString2(chars, low, high);
                    break;
                } else {
                    reverseString2(chars, low, high - 1);
                }
                low = high + 1;
            }
            high++;
        }
        return String.valueOf(chars);
    }


    public static void reverseString2(char[] s, int low, int high) {
        while (high > low) {
            char c = s[high];
            s[high] = s[low];
            s[low] = c;
            high--;
            low++;
        }
    }
}
