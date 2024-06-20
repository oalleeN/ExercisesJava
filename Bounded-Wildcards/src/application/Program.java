package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
         List<Shape> myShapes = new ArrayList<>();
         myShapes.add(new Rectangle(3.0, 2.0));
         myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));

    }

    public static double totalArea(List<? extends Shape> list) { // recebe qaulquer tipo Shape ou qualquer
        double total = 0.0;                                     // subtipo de Shape
        for (Shape s: list) {
            total += s.area();
        }
        return total;
    }
}
