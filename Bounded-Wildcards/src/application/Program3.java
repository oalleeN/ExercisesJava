package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {

        List<Integer> myInt = Arrays.asList(1, 2, 3);
        List<Double> myDouble = Arrays.asList(3.14, 6.28);
        List<Object> myObject = new ArrayList<Object>();

        copy(myInt, myObject);
        printList(myObject);

        copy(myDouble,myObject);
        printList(myObject);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
 }
