package com.learnings.sortingtechniques.bubble_sort;

import java.util.Arrays;

/**
 * This sorting algorithm is too slow
 * How it works?
 * ==============
 * Compare the 1st item with the 2nd. If needed swap.
 * Do this again and again till the 1st element gets the right place
 *
 * Time complexity
 *
 * Best Case - O(n) - linear
 * Worst Case - O(n^2) - quadratic
 */
public class BubbleSort {
    private void sort(int[] numberArray) {
        for (var i = 0; i < numberArray.length; i++) {//start from 0th index of the array
            for(int j=1; j < (numberArray.length-i); j++) {
                if (numberArray[j-1] > numberArray[j]) {
                    swap(numberArray, j, j - 1);
                }
            }
        }
    }

    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void main(String[] args){
        int[] numbers = {3, 8, 1, 7, 4, 9};// 1, 3, 4, 7, 8, 9
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
