package com.crack_byte;

public class HelpFromSam {
    public static void main(String[] args) {
        System.out.println(solve(7));
    }
    public static int solve(int A) {
        int i=0;
        while(A>0){
            if((A & 1) == 1){
                i++;
            }
            A = A >> 1;
        }
        return i;
    }
}
