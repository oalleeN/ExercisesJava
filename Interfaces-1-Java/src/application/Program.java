package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental details...");
        System.out.print("Car's model: ");
        String carModel = sc.nextLine();
        System.out.print("Withdrawal (dd/mm/yyyy hh/mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.print("Recurrence (dd/mm/yyyy hh/mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), formatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter the price per hour: ");
        double piecePerHour = sc.nextDouble();
        System.out.print("Enter the price per day: ");
        double piecePerDay = sc.nextDouble();

        RentalService service = new RentalService(piecePerHour, piecePerDay, new BrazilTaxService());
        service.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().totalPayment()));




        sc.close();
    }
}
