package com.learnings.sortingtechniques.merge_sort;

import java.util.Arrays;

/**

 * How it works?
 * ==============

 *
 * Time complexity
 *
 * Best Case - 	O(n*logn) -
 * Worst Case - O(n*logn) -
 */
public class MergeSort {
    /* Function to merge the subarrays of a[] */
    void merge(int a[], int beg, int mid, int end)
    {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(int a[], int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public static void main(String[] args)
    {
        int[] numbers = { 3, 8, 1, 7, 4, 9 };// 1, 3, 4, 7, 8, 9
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
