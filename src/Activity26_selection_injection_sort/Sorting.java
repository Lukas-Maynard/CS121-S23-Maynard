package src.Activity26_selection_injection_sort;

import java.util.Arrays;

public class Sorting {

    public void quickSort(int[] array, int start, int end){
        int pivot = partition(array,start,end);
        if(start<pivot-1){
            quickSort(array,pivot,end);
        }
        if (pivot<end){
            quickSort(array,pivot,end);
        }
        System.out.println(Arrays.toString(array));
    }

    private int partition(int[] array,int start,int end){
        int i = start;
        int j = end;
        int temp;
        int pivot = array[(start+end)/2];

        while(i<=j){
            while(array[i]<pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            if (i<=j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}

