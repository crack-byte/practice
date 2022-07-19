package com.crack_byte;

public class PickFromBothSides {
    public static void main(String[] args) {
        System.out.println(solve(48, -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35));
    }

    public static int solve(int B, int... A) {
        int[] pf = new int[A.length];
        int[] sf = new int[A.length];
        pf[0] = A[0];
        sf[A.length - 1] = A[A.length - 1];
        for (int i = 1, j = A.length - 2; i < A.length; ++i, --j) {
            pf[i] = A[i] + pf[i - 1];
            sf[j] = A[j] + sf[j + 1];
        }
        int max = sf[A.length - B];
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i] + ((i + 1 == B) ? 0 : sf[A.length - (B - (i + 1))]));

        }
        return max;
    }

    public static int solve1(int B, int... A) {
        int[] sf = new int[A.length];
        sf[A.length - 1] = A[A.length - 1];
        for (int j = A.length - 2; j >= 0; --j) {
            sf[j] = A[j] + sf[j + 1];
        }
        int max = sf[A.length - B];
        for (int i = 0; i < B; i++) {
            max = Math.max(max, A[i] + ((i + 1 == B) ? 0 : sf[A.length - B - i - 1]));
        }
        return max;
    }
}
