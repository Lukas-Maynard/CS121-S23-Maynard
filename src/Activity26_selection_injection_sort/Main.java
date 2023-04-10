/*
**************************************************************
            Activity #26 - Quick sort
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (4/5/2023)
 *************************************************************
        Uses quicksort class to get user input in unordered list
        then uses quicksort to order list
 *************************************************************
*/
package src.Activity26_selection_injection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        quickSorting sorting = new quickSorting();
        int[] unsortedArray = sorting.getArray();
        System.out.println("Unsorted array:"+ Arrays.toString(unsortedArray));

        sorting.quickSort(unsortedArray,0,unsortedArray.length-1);
    }
}
