package com.learnings.sortingtechniques.insertion_sort;

import java.util.Arrays;

/**
 * Time complexity
 *
 * Best Case - O(n) - linear
 * Worst Case - O(n^2) - if initial array is in descending order
 *
 */
public class InsertionSort {

    private void sort(int[] numberArray) {
        for (var i = 1; i < numberArray.length; i++) {
            var current = numberArray[i];//get the second element
            var j = i - 1;
            while (j >= 0 && numberArray[j] > current) {//check whether the 1st element is larger than the second
                numberArray[j+1] = numberArray[j];//if so add the temp variable to 1st place.(not swapping)
                j--;
            }
            numberArray[j+1] = current;
        }
    }
    public static void main(String[]args){
        int[] numbers = {3, 8, 1, 7, 4, 9};// 1, 3, 4, 7, 8, 9
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
