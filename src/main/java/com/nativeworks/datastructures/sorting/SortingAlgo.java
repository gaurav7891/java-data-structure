package com.nativeworks.datastructures.sorting;

import java.util.Arrays;

public class SortingAlgo {


    public static void bubbleSort(int[] arr) {
        //🔹 Concept: Repeatedly swap adjacent elements if they are in the wrong order.
        //🔹 Time Complexity: O(N²) (Worst & Average), O(N) (Best if already sorted)
        //🔹 Space Complexity: O(1) (In-place)
        //🔹 Stable: ✅ Yes
        //🔹 Best For: Small datasets, educational purposes.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Bubble sorted array:: " + Arrays.toString(arr));
    }


    public static void selectionSort(int[] arr) {
        //🔹 Concept: Select the minimum element and swap it with the first unsorted element.
        //🔹 Time Complexity: O(N²) for all cases
        //🔹 Space Complexity: O(1) (In-place)
        //🔹 Stable: ❌ No
        //🔹 Best For: Small datasets, when memory is a constraint.
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("Selection sorted array:: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        //🔹 Concept: Pick each element and insert it in the correct position in the sorted part of the array.
        //🔹 Time Complexity: O(N²) (Worst & Average), O(N) (Best if already sorted)
        //🔹 Space Complexity: O(1) (In-place)
        //🔹 Stable: ✅ Yes
        //🔹 Best For: Small datasets, nearly sorted data.
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println();
        System.out.println("Insertion sorted array:: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 5, 8, 1, 0, 2, 6, 7};
        System.out.println("Given array:: " + Arrays.toString(arr));
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }
}
