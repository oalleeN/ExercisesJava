package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        /* Principio Get/Put - Covariância.
           Get - OK
           Put (Adicionar) - Error
         */
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        list.add(20); // erro de compilacao


        /* Principio Get/Put - Contravariância.
           Get - Error
           Put - OK
        */
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        Number x = myNums.get(0); // erro de compilacao
    }
}
