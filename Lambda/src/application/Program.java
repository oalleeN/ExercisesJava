package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tz", 200.00));
        list.add(new Product("Lapis", 450.00));
        list.add(new Product("Alz", 26.00));

        list.sort(new MyComparator());

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
