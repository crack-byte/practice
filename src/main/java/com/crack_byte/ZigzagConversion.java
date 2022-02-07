package com.crack_byte;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = convert("PAYPALISHIRING", 3);
        System.out.println(s);
        System.out.println(s.equals("PAHNAPLSIIGYIR"));
        String s2 = convert("PAYPALISHIRING", 4);
        System.out.println(s2);
        System.out.println("PINALSIGYAHRPI");
        System.out.println(s2.equals("PINALSIGYAHRPI"));
        String s1 = convert("A", 1);
        System.out.println(s1);
        System.out.println("A");
        System.out.println(s1.equals("A"));
    }

    public static String convert(String s, int numRows) {
        StringBuilder builder = new StringBuilder();
        int maxGap = numRows == 1 ? 1 : (numRows - 1) * 2, p = maxGap;
        int length = s.length(), num = 0;
        while (num < numRows) {
            int q = maxGap > p ? maxGap - p : maxGap;
            boolean bool = true;
            for (int i = num; i < length; ) {
                builder.append(s.charAt(i));
                if (bool) {
                    i = i + p;
                    bool = false;
                } else {
                    i = i + q;
                    bool = true;
                }
            }
            p = p - 2 == 0 ? maxGap : p - 2;
            ++num;
        }
        return builder.toString();
    }
}
