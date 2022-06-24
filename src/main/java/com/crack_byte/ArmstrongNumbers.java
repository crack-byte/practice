package com.crack_byte;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(1);
        if (num >= 153) {
            System.out.println(153);
            int i = 154;
            while (i <= num) {
                int d = i, sum = 0;
                while (d > 0) {
                    int digit = d % 10;
                    sum += (digit * digit * digit);
                    if (sum > num) break;
                    d = d / 10;
                }
                if (sum == i) {
                    System.out.println(i);
                }
                ++i;
            }
        }
    }
}
