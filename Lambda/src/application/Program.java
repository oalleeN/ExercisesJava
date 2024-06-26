package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tz", 200.00));
        list.add(new Product("Lapis", 450.00));
        list.add(new Product("Alz", 26.00));

        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
