package src.Activity29_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(5.5,6.7,8.9,10.1,11.3));
        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a','b','c','b','e'));
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("this","is","an","ArrayList","string"));

        System.out.print("Integers: ");
        generic.ArrayPrintList(integers);
        System.out.print("Doubles: ");
        generic.ArrayPrintList(doubles);
        System.out.print("Characters: ");
        generic.ArrayPrintList(characters);
        System.out.print("Strings: ");
        generic.ArrayPrintList(strings);
    }
}
