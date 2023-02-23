package src.Activity16;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][][][] array1 = {{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}}};
                //,{{{13,14,15},{16,17,18}},{{19,20,21},{22,23,24}}},{{{25,26,27},{28,29,30}},{{31,32,33},{34,35,36}}}};

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
