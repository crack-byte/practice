package com.crack_byte;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        reverseOnlyLetters("a-bC-dEf-ghIj");
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            while (i<j && convertChar(chars[i]) == 0) {
                ++i;
            }
            while (i<j && convertChar(chars[j]) == 0) {
                --j;
            }
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            ++i;
            --j;
        }
        return new String(chars);
    }

    private static int convertChar(char c) {
        if ((c >= 97 && c <= 122) ) {
            return c;
        } else if (c >= 65 && c <= 90) {
            return c;
        }
        return 0;
    }
}
