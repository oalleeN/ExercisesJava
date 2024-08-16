package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Product product = new Product();
        List<Product> list = new ArrayList<>();

        String path = "C:\\tmp\\in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] separate = line.split(",");
                list.add(new Product(separate[0], Double.parseDouble(separate[1])));
                line = br.readLine();
            }

            product.printList(list);
            Product x = CalculationService.max(list);
            out.println("\nMax: " + x);

        } catch (IOException e) {
            out.println(e.getMessage());
        }
    }
}
