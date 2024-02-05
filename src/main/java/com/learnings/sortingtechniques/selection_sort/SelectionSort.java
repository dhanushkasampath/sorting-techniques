package com.learnings.sortingtechniques.selection_sort;

import java.util.Arrays;

/**
 * There are two steps,
 * 1. Find the smallest number
 * 2. swap it with the 1st element of unsorted list
 *
 * Time complexity
 *
 * Best Case -
 * Worst Case -
 *
 */
public class SelectionSort {

    private void sort(int[] numberArray) {//the are 2 nested for loops
        for (int i = 0; i < numberArray.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < numberArray.length; j++){
                if (numberArray[j] < numberArray[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = numberArray[index];
            numberArray[index] = numberArray[i];
            numberArray[i] = smallerNumber;
        }
    }
    public static void main(String[]args){
        int[] numbers = {3, 8, 1, 7, 4, 9};// 1, 3, 4, 7, 8, 9
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
