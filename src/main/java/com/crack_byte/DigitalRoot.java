package com.crack_byte;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(addDigits(1234));
        System.out.println(addDigits(12345));
        System.out.println(addDigits(123456));
        System.out.println(addDigits(1234567));
    }

    public static int addDigits(int num) {
        if (num % 9 == 0 && num != 0) {
            return 9;
        }
        return num % 9;
    }
}
