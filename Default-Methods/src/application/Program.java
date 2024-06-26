package application;

import services.BrazilInterestService;
import services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        System.out.println("Payment after " + months + " months:");

        InterestService interestService = new BrazilInterestService(2.0);
        double value = interestService.payment(amount, months);

        System.out.println(String.format("%.2f",value));



        sc.close();
    }
}
