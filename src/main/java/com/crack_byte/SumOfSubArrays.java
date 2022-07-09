package com.crack_byte;

public class SumOfSubArrays {
    public static void main(String[] args) {
        System.out.println(subarraySum1(3, 10, 1, 10, 6, 2, 4, 5, 1, 4));
    }

    public static long subarraySum(int... A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            int s = 0;
            for (int j = i; j < A.length; j++) {
                if (j != i) {
                    sum +=  s + A[j];
                    s = s + A[j];
                }
                else {
                    s = A[j];
                    sum+=A[j];
                }
            }
        }
        return sum;
    }

    public static long subarraySum1(int... A) {
        int sum = 0;int k = A.length;
        for (int i = 0; i < k; i++) {
           sum = sum + (A[i] * (k - i) * (i+1));
        }
        return sum;
    }
}
