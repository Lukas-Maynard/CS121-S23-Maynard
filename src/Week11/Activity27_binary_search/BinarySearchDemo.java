package src.Week11.Activity27_binary_search;

import java.util.ArrayList;

public class BinarySearchDemo {
    public int binarySearch(int key, ArrayList<Integer> array){
        int counter = 0;
        int low = 0;
        int high = array.size()-1;
        int mid = (low+high)/2;
        System.out.printf("comparison %d:\t", ++counter);
        for (int n: array){
            System.out.print(n+" ");
        }
        System.out.printf("\n\tLow index: %d (%d) \tMid index: %d (%d)\tHigh index:%d (%d) \n\n",
                low, array.get(low), mid, array.get(mid), high, array.get(high));

        while (low <= high && array.get(mid) != key){
            if (array.get(mid) < key){
                low = mid+1;
            } else {
                high = mid-1;
            }
            mid = (low+high)/2;
            System.out.printf("comparison %d:\t", ++counter);
            for(int i = low; i <= high; i++){
                System.out.print(array.get(i) + " ");
            }
            System.out.printf("\n\tLow index: %d (%d) \tMid index: %d (%d)\tHigh index:%d (%d) \n\n",
                    low, array.get(low), mid, array.get(mid), high, array.get(high));
        }
        if(low > high){
            mid = -1;
        }
        return mid;
    }
}