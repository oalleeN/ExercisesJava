package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractServices;
import model.services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter contract details...");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/mm/yyyy): ");
        LocalDate dateContract = LocalDate.parse(sc.next(), fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, dateContract, totalValue);

        System.out.print("Installments: ");
        int installment = sc.nextInt();

        ContractServices contractServices = new ContractServices(new PaypalService());
        contractServices.processContract(contract, installment);

        System.out.println("INSTALLMENTS: ");
        for (Installment installments : contract.getInstallments()) {
            System.out.println(installments);
        }

        sc.close();
    }
}
