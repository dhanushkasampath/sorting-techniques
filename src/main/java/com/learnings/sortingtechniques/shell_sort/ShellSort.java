package com.learnings.sortingtechniques.shell_sort;

import java.util.Arrays;

public class ShellSort {
    /* function to implement shellSort */
    private void sort(int[] numbersArray) {
        int n = numbersArray.length;
        /* Rearrange the array elements at n/2, n/4, ..., 1 intervals */
        for (int interval = n/2; interval > 0; interval /= 2)
        {
            for (int i = interval; i < n; i += 1)
            {
            /* store a[i] to the variable temp and make

the ith position empty */
                int temp = numbersArray[i];
                int j;
                for (j = i; j >= interval && numbersArray[j - interval] >
                        temp; j -= interval)
                    numbersArray[j] = numbersArray[j - interval];

            /* put temp (the original a[i]) in its correct
position */
                numbersArray[j] = temp;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] numbers = {3, 8, 1, 7, 4, 9};// 1, 3, 4, 7, 8, 9
        ShellSort shellSort = new ShellSort();
        shellSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
