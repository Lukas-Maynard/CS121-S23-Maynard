/*
**************************************************************
            Activity #26 - Quick sort
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (4/5/2023)
 *************************************************************
 */
package src.Week11.Activity26_selection_injection_sort;

import java.util.Arrays;
import java.util.Scanner;

public class quickSorting {
    public int[] getArray(){
        int[] array = new int[5];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 5 unsorted integers");
        for (int i=0;i<5;i++){
            String input = console.next();
            array[i] = Integer.parseInt(input);
        }
        return array;
    }

    public void quickSort(int[] array, int start, int end){
        int pivot = partition(array,start,end);
        if(start<pivot-1){
            quickSort(array,start, pivot-1);
        }
        if (pivot<end){
            quickSort(array,pivot,end);
        }
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
                System.out.printf("""
                %s start: %d end: %d pivot: %d
                """,Arrays.toString(array),array[i],array[j],pivot);
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                System.out.printf("""
                %s start: %d end: %d pivot: %d
                """,Arrays.toString(array),array[i],array[j],pivot);

            }
        }
        return i;
    }
}

