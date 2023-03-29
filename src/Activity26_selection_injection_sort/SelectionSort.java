package src.Activity26_selection_injection_sort;

import java.util.Scanner;

public class SelectionSort {
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
        for (int i = 0;i<array.length-1 ;i++){
            int min = i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[min]){
                    min = array[j];
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
