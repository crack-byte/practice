package com.crack_byte;

import java.util.ArrayList;

public class MaxMod {
    public static int solve(ArrayList<Integer> A) {
        int j = A.size() - 1, max = 0;
        while (j > 0) {
//            System.out.println(j);
            int i = j - 1;
            while (i >= 0) {
                System.out.println(i + "," + j + "=" + A.get(i) % A.get(j));
                max = Math.max(max, A.get(i) % A.get(j));
                max = Math.max(max, A.get(j) % A.get(i));
                --i;
            }
            --j;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(683, 354, 95, 937, 78, 246, 319, 516, 913, 112));
        System.out.println(solve(arrayList));
    }
}
