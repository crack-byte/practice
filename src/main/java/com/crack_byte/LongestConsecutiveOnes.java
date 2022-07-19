package com.crack_byte;

public class LongestConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(solve("0000101011000000000"));
    }

    public static int solve(String A) {
        char[] c = A.toCharArray();
        int len = c.length, count = 0;
        for (char value : c) {
            if (value == '1') count++;
        }
        if (count == len) {
            return len;
        }
        int a = 0;
        for (int i = 0; i < len; i++) {
            if (c[i] == '0') {
                int l = 0, r = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (c[j] == '1') l++;
                    else break;
                }
                for (int j = i + 1; j < len; j++) {
                    if (c[j] == '1') r++;
                    else break;
                }
                int t = l + r;
                if (t < count) {
                    t++;
                }
                if (a < t) a = t;
            }
        }
        return a;
    }
}
