package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("First: " + printService.first());


        sc.close();
    }
}
