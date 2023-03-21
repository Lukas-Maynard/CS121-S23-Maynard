/*
**************************************************************
            Activity #25 - Bubble Sort
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (3/21/2023)
 *************************************************************
        Uses methods from other file, prints returned values.
 *************************************************************
*/
package src.Activity25_sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] unsortedArray = sort.getArray();
        System.out.println("Unsorted array:"+ Arrays.toString(unsortedArray));

        int[] sortedArray = sort.sortArray(unsortedArray);
        System.out.println("Sorted array:"+Arrays.toString(sortedArray));
    }
}
