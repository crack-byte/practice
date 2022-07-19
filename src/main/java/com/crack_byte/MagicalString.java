package com.crack_byte;

public class MagicalString {
    static final int magicValue = 1 ^ 2;

    public static void main(String[] args) {
        int i = magicalString(8);
    }

    public static int magicalString(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        if (n == 4) return 2;
        int[] series = new int[100000];
        series[0] = 1;
        series[1] = 2;
        series[2] = 2;
        series[3] = 1;
        int i = 3;
        int j = 2;
        int count = 1;
        int num = 1;
        while (i < n) {
            int t = 0;
            while (t < series[j]) {
                series[++i] = num;
                if (num == 1 && i < n) {
                    count++;
                }
                t++;
            }
            j++;
            num = num ^ magicValue;
        }
        return count;
    }

}
