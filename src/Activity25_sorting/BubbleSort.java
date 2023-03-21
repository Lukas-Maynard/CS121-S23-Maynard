/*
**************************************************************
            Activity #25 - Bubble Sort
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (3/21/2023)
 *************************************************************
        User inputs 5 int for array, then bubble sort
 *************************************************************
*/
package src.Activity25_sorting;

import java.util.Scanner;

public class BubbleSort {
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

    public int[] sortArray(int[] array){
        int temp;
        for (int i = 0;i<array.length-1 ;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
