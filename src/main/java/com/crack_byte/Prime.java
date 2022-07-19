package com.crack_byte;

import java.util.Scanner;

public class Prime {
    static final int[] arr = {
            2, 3, 5, 7, 11, 13, 17, 19, 23,
            29, 31, 37, 41, 43, 47, 53, 59, 61,
            67, 71, 73, 79, 83, 89, 97, 101, 103,
            107, 109, 113, 127, 131, 137, 139, 149, 151,
            157, 163, 167, 173, 179, 181, 191, 193, 197,
            199
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("YES");
            System.exit(0);
        } else {
            if (n % 2 == 0) {
                System.out.println("NO");
                System.exit(0);
            } else {
                int sum = 0, d = n;
                while (d > 0) {
                    sum += d % 10;
                    d = d / 10;
                }
                if (sum % 3 == 0) {
                    System.out.println("NO");
                    System.exit(0);
                }
                int i = 0, sqrt = (int) Math.sqrt(n);
                while (i < arr.length) {
                    if (arr[i] >= sqrt) break;
                    if (n % arr[i] == 0) {
                        System.out.println("NO");
                        System.exit(0);
                    }
                    ++i;
                }
            }
        }
        System.out.println("YES");
    }
}
