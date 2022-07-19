package com.crack_byte;

import java.util.Scanner;

public class SeparateOddEven {
    /*
     * Example Input:
     * 2
     * 3
     * 2 2 2
     * 2
     * 1 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[1000000];
        int c = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] even = new int[n];
            int[] odd = new int[n];
            int e = 0, o = 0;
            while (n-- > 0) {
                int num = sc.nextInt();
                if ((num & 1) == 1) {
                    odd[o++] = num;
                } else {
                    even[e++] = num;
                }
            }
            n = 0;
            if (o > 0) {
                while (n < odd.length) {
                    if (odd[n] == 0) {
                        arr[n + c] = -1;
                        break;
                    }
                    arr[n + c] = odd[n];
                    ++n;
                }
                if (arr[n + c] == 0) {
                    arr[n + c] = -1;
                    ++c;
                }
                if (n > 0 && arr[c + n] != 0) {
                    c = c + n + 1;
                } else {
                    c = c + n;
                }
            } else {
                arr[c++] = -1;
            }

            n = 0;
            if (e > 0) {
                while (n < even.length) {
                    if (even[n] == 0) {
                        arr[n + c] = -1;
                        break;
                    }
                    arr[n + c] = even[n];
                    ++n;
                }
                if (arr[c + n] == 0) {
                    arr[c + n] = -1;
                    ++c;
                }
                if (n > 0 && arr[c + n] != 0) {
                    c = c + n + 1;
                } else {
                    c = c + n;
                }
            } else {
                arr[c++] = -1;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                System.out.print('\n');
            } else {
                if (arr[i] == 0) {
                    break;
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
