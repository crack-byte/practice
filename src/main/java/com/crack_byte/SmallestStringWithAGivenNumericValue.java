package com.crack_byte;

public class SmallestStringWithAGivenNumericValue {
    public static void main(String[] args) {
        getSmallestString(2, 28);
    }


    public static String getSmallestString(int n, int k) {
        char[] cs = new char[n];
        int sum = n * 26;
        for(int i=0; i < n; i++){
            cs[i] = 'z';
        }
        int i=0;
        while((sum - k) > 25){
            cs[i++]='a';
            sum -= 25;
        }
        cs[i] = (char)(cs[i] - (sum-k));

        return new String(cs);
    }
}
