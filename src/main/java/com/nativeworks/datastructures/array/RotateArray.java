package com.nativeworks.datastructures.array;


import java.util.Arrays;

/**
 * Left Rotation (anti-clockwise)
 * Consider the below array example left rotating 2 elements
 * 1   2   3   4   5   6
 * 2   3   4   5   6   1
 * 3   4   5   6   1   2
 * <p>
 * o/p =   3   4   5   6   1   2
 * Right Rotation (clockwise)
 * Consider the below array example right rotating 2 elements
 * <p>
 * 1    2   3   4   5   6
 * 6    1   2   3   4   5
 * 5    6   1   2   3   4
 * <p>
 * o/p = 5  6   1   2   3   4
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int rotateBy = 2;
        System.out.println(Arrays.toString(leftRotate(arr, rotateBy)));
        int[] arr2 = {100, 200, 300, 400, 500, 600};
        int rotateBy2 = 3;
        System.out.println(Arrays.toString(rightRotate(arr2, rotateBy2)));
    }

    private static int[] leftRotate(int[] arr, int rotateBy) {
        int n = arr.length;
        // rotate one by one
        for (int i = 0; i < rotateBy; i++) {
            int first = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        return arr;
    }

    private static int[] rightRotate(int[] arr, int rotateBy) {
        int n = arr.length;
        // rotate one by one
        for (int i = 0; i < rotateBy; i++) {
            int last = arr[n-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        return arr;
    }
}
