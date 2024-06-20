package application;

import entities.Employee;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        String path = "C:\\tmp\\in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] separate = line.split(",");
                list.add(new Employee(separate[0], Double.parseDouble(separate[1])));
                line = br.readLine();
            }

            Employee x = CalculationService.max(list);
            System.out.println("Max: " + x);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
