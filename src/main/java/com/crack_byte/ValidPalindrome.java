package com.crack_byte;

public class ValidPalindrome {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(".,");
        palindrome = palindrome;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            int l = convertChar(s.charAt(i));
            while (i < j && l == 0) {
                l = convertChar(s.charAt(++i));
            }
            int r = convertChar(s.charAt(j));
            while (i < j && r == 0) {
                r = convertChar(s.charAt(--j));
            }

            if ((l != r) || i>j )return false;
            ++i;
            --j;
        }
        return true;
    }

    private static int convertChar(char c) {
        if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
            return c;
        } else if (c >= 65 && c <= 90) {
            return c + 32;
        }
        return 0;
    }
}

