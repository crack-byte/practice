package com.crack_byte;

public class SpecialSubsequence {
    long M = 1000000007;
    public static void main(String[] args) {
        System.out.println(solve("ABCGAG"));
    }
    public static int solve(String A) {
        char[] chars = A.toCharArray();
        int a = 0,g=0,i = chars.length - 1;
        while (i >= 0) {
          if(chars[i] == 'G'){
              ++g;
          }else if(chars[i] == 'A'){
              a+=g;
          }
            --i;
        }
        return a;
    }
}
