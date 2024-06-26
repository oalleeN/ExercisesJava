package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> record = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {

                String[] build = line.split(",");
                String name = build[0];
                int number = Integer.parseInt(build[1]);

                if (record.containsKey(name)) {
                    /* int sum = record.get(name);
                    record.put(name, number + sum); */
                    record.compute(name, (k, sum) -> number + sum);
                } else {
                    record.put(name, number);
                }


                line = br.readLine();
            }

            for (String str : record.keySet()) {
                System.out.println(str + ": " + record.get(str));
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
