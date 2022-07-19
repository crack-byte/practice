package com.crack_byte;

public class HelloWorld {
    public static void main(String[] args) {


        System.out.println("output is :" + printReturn());

    }

    static int printReturn() {
        try {
            throw new Exception("Block test");
        } catch (Exception e) {
            return 1;
        } finally {

            return 2;
        }

    }
}
