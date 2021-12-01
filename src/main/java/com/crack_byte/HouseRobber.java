package com.crack_byte;

public class HouseRobber {
    public static void main(String[] args) {
        int rob = rob(2, 1, 1, 2);
    }

    public static int rob(int... nums) {
        int s1 = 0, s2 = 0;
        boolean c = true;
        for (int num : nums) {
            if (c) {
                s1 += num;
                s1 = Math.max(s1, s2);
            } else {
                s2 += num;
                s2 = Math.max(s1, s2);
            }
            c = !c;
        }
        return Math.max(s1, s2);
    }

}
