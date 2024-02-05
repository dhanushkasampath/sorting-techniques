package com.learnings.sortingtechniques.quick_sort;

import java.util.Arrays;

/**
 * This is a recursive algorithm. also known as pivot sort
 * elements on the left side of pivot point is less than that and elements on the right side are greater than that
 *
 *
 * How it works?
 * ==============
 *
 *
 *
 * Time complexity
 *
 * Best Case - O(n*logn) - linear
 * Worst Case - O(n^2) - quadratic
 */
public class QuickSort {


    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    private int partition(int[] arr, int firstIndex, int lastIndex)
    {
        // Choosing the pivot
        int pivot = arr[lastIndex];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (firstIndex - 1);

        for (int j = firstIndex; j <= lastIndex - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, lastIndex);
        return (i + 1);
    }

    /**
     *
     * The main function that implements QuickSort
     * @param arr - Array to be sorted,
     * @param firstIndex - firstIndex
     * @param lastIndex - lastIndex
     */
    private void quickSort(int[] arr, int firstIndex, int lastIndex)
    {
        if (firstIndex < lastIndex) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, firstIndex, lastIndex);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, firstIndex, pi - 1);
            quickSort(arr, pi + 1, lastIndex);
        }
    }

    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void main(String[]args){
        int[] numbers = {3, 8, 1, 7, 4, 9};// 1, 3, 4, 7, 8, 9
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
}
