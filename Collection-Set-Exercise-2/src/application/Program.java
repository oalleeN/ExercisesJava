package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new TreeSet<>();
        Set<Integer> courseB = new TreeSet<>();
        Set<Integer> courseC = new TreeSet<>();

        System.out.print("How many students for course A? ");
        int num = sc.nextInt() ;
        for (int i = 0 ; i < num ; i++ ) {
            courseA.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        num = sc.nextInt() ;
        for (int i = 0 ; i < num ; i++ ) {
            courseB.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        num = sc.nextInt() ;
        for (int i = 0 ; i < num ; i++ ) {
            courseC.add(sc.nextInt());
        }

        courseB.addAll(courseA);
        courseC.addAll(courseB);

        System.out.println("Total students: " + courseC.size());

        sc.close();

    }
}
