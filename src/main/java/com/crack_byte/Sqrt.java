package com.crack_byte;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine().substring(4));
        int i = 1;
        while( i * i <= num){
            if(i*i==num){
                System.out.println(i);
                break;
//                return i;
            }
            ++i;
        }
        System.out.println(-1);
    }
}
