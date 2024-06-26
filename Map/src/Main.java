import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("Folha", 700.00);
        Product p3 = new Product("Joelho", 250.00);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 30000.0);

        Product ps = new Product("Tv", 900.00);

        System.out.println("contains 'ps' key: " + stock.containsKey(ps));

    }
}