package com.crack_byte;

import java.util.Scanner;

public class PerfectInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int j = 0;
        while (j < n) {
            arr[j++] = scanner.nextInt();
        }
        j = 0;
        while (j < n) {
            int num = arr[j++];
            int sum = 1, i = 2;
            while (i * i <= num) {
                if (num % i == 0) {
                    sum += i;
                    if (i != num / i) {
                        sum += num / i;
                    }
                }
                ++i;
            }
            if (sum == num) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
