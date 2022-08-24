package com.crack_byte.thread;

public class KthSymbol {
    public static void main(String[] args) {
        System.out.println(fun(3, 5));
    }

    static int fun(int n, int k) {
        if (k == 0) return 0;
        int p = fun(n - 1, k / 2);
        if (k % 2 == 0) {
            return p;
        } else {
            return 1 - p;
        }
    }
}
