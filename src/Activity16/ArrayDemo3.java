package src.Activity16;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 3D array
        int[][][] array = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};

        for(int[][] i:array){
            for(int[] j:i){
                for(int k:j){
                    System.out.println(k);
                }
            }
        }
    }
}

