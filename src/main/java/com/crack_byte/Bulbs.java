package com.crack_byte;

public class Bulbs {
    public static void main(String[] args) {
        System.out.println(bulbs(1, 1, 0, 0, 1, 1, 0, 0, 1));
    }

    public static int bulbs(int... A) {
        boolean flip = false;
        int count = 0;
        for (Integer i : A) {
            if ((i == 0 || flip) && (i == 1 || !flip)) {
                count++;
                flip = !flip;
            }
        }
        return count;
    }
}
