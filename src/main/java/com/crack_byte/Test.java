package com.crack_byte;

public class Test {
    public static void main(String[] args) {
        int a = 1, i = 2, b = 0;
        do {
            int i1 = b + a;
            int i2 = i1 * i;
            System.out.println(i + " x" + (i1 / 10 < 1 ? ' ' : "") + i1 + ' ' + "=" + (i2 / 10 < 1 ? ' ' : "") + i2);
            a++;
        }
        while (a <= 10);
    }
}
