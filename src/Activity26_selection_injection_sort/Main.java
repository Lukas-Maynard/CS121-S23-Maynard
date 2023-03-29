package src.Activity26_selection_injection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] unsortedArray = sort.getArray();
        System.out.println("Unsorted array:"+ Arrays.toString(unsortedArray));
/*
        int[] sortedArray = sort.sortArray(unsortedArray);
        System.out.println("Sorted array:"+Arrays.toString(sortedArray));
  */
        Sorting sorting = new Sorting();
        sorting.quickSort(unsortedArray,0,unsortedArray.length-1);

    }
}
