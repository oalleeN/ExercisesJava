package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

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
