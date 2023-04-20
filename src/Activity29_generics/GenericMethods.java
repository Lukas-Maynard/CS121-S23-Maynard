package src.Activity29_generics;

import java.util.ArrayList;

public class GenericMethods {
    public <E> void ArrayPrintList(ArrayList<E> inputArray){
        for (E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
