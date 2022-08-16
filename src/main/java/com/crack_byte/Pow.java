package com.crack_byte;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        System.out.println(pow(n, p));
    }

    private static long pow(int n, int p) {
        long pow = halfPow(n, p / 2);
        if ((p & 1) == 1) {
            return ((pow * pow) % 1000000007 * n);
        } else {
            return (pow * pow) % 1000000007;
        }
    }

    public static long halfPow(int n, int p) {
        System.out.println("here");
        if (p == 0) return 1;
        return halfPow(n, p - 1) % 1000000007 * n;
    }
}
