package com.crack_byte;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        printSquare(sc.nextInt());
    }

    static void printSquare(int n) throws InterruptedException {
        int[][] m = new int[n][n];
        int d = 0;
        n *= n;
        while (n > 0) {
            n /= 10;
            d++;
        }
        int c = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = c++;
            }
        }

        for (int i = 0; i < m.length; i++) {
            int[] ar = m[i];
            toString(ar, d);
        }
    }

    public static void toString(int[] a, int d) throws InterruptedException {
        int i = 0;
        while (true) {
            System.out.print(a[i]);
            if (i == a.length - 1) {
                System.out.println("");
                Thread.sleep(500);
                return;
            }
            printSpaces(d);
            i++;
            Thread.sleep(100);
        }
    }

    static void printSpaces(int d) {
        while (d-- > 0) {
            System.out.print(" ");
        }
    }
}
