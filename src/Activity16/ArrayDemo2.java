package src.Activity16;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //String[][][][] array1 = {{{{"This","is","a"},{"4","Dimensional","array"}}}};
        int[][][][] array1 = {{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}}};

        for(int i=0;i<1;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<3;l++){
                        System.out.println(array1[i][j][k][l]);
                    }
                }
            }
        }
    }
}
