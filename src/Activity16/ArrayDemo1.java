package src.Activity16;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 4D array
        int[][][][] array1 = {{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}}};

        // Displaying with foreach loops
        for(int[][][] i:array1){
            for(int[][] j:i){
                for(int[]k:j){
                    for(int l:k){
                        System.out.println(l);
                    }
                }
            }
        }
    }
}
