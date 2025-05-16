package com.nativeworks.datastructures.array;

/**
 * Given an array arr[], the task is to print every
 * alternate element of the array starting from first element
 * Input: arr[] = [-5, 1, 4, 2, 12]
 * Output: -5 4 12
 */
public class PrintAlternate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printAlternateValue(arr);
    }

    // iterative approach: start from index 0 and increment index by 2
    private static void printAlternateValue(int[] arr) {
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}

