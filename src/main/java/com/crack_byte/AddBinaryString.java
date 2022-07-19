package com.crack_byte;

public class AddBinaryString {
    public static void main(String[] args) {
        System.out.println("A:0001010110111001101101000");
        System.out.println("B:1000011011000000111100110");
        System.out.println("---------------------------");
        String r = addBinary("1010110111001101101000", "1000011011000000111100110");
        System.out.println("R:" + r);
        String e = "1001110001111010101001110";
        System.out.println("E:" + e);
        System.out.println(e.equals(r) ? "Passed" : "Failed");
    }

    public static String addBinary(String A, String B) {
        int a = A.length(), b = B.length();
        int carry = 0;
        int len = Math.max(a, b);
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= len; i++) {
            int c1 = a - i >= 0 ? (int) A.charAt(a - i) / 49 : 0;
            int c2 = b - i >= 0 ? (int) B.charAt(b - i) / 49 : 0;
            int sum = c1 + c2;
            if ((sum > 1)) {
                if (carry == 0) {
                    carry = 1;
                    s.insert(0, 0);
                } else {
                    s.insert(0, 1);
                }
            } else {
                if (carry == 0) {
                    s.insert(0, sum);
                } else {
                    if (sum + carry > 1) {
                        s.insert(0, 0);
                    } else {
                        s.insert(0, sum + carry);
                        carry = 0;
                    }
                }
            }

        }
        if (carry > 0) {
            s.insert(0, carry);
        }
        return s.toString();
    }
}
