package com.crack_byte;

public class FirstUniqueCharacterInString {
    public static int firstUniqChar(String s) {
        int index = 100000, max = index;
        int c = 97;
        while (c <= 122) {
            int i = s.indexOf(c);
            if (i >= 0 && i == s.lastIndexOf(c) && i < index) {
                index = i;
            }
            ++c;
        }
        return index == max ? -1 : index;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
