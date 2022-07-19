package com.crack_byte;

import java.util.Arrays;

// reference geeks for geeks
public class QuickSort {

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private static int divide(int[] arr, int l, int r) {
        int pivot = arr[r], j = l, swapPoint = --l;
        while (j <= r - 1) {
            if (arr[j] < pivot) swap(arr, ++swapPoint, j);
            ++j;
        }
        swap(arr, ++swapPoint, r);
        return swapPoint;
    }

    static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int pivotPos = divide(arr, l, r);
            System.out.print("pivotPos:" + pivotPos);
            System.out.print(" left:" + l);
            System.out.println(" right:" + r);
            sort(arr, l, pivotPos - 1);
            sort(arr, pivotPos + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 32, 5, 3, 2, 5, 56, 67, 4, 3, 5, 35, 23, 43, 55, 665, 76, 4, 3, 32, 54, 3, 32323, 123, 3123, 23, 23223, 445, 45, 5767, 87, 78, 65, 564, 54, 43, 34, 34, 3};
        int len = arr.length;
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        long l = System.nanoTime();
        sort(arr, 0, len - 1);
        System.out.println("nano time for sort: " + (System.nanoTime() - l));
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        System.out.println();
    }

}
