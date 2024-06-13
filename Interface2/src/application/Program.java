package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        AbstractShape rectangle = new Rectangle(Color.BLACK, 3.0, 4.0);
        AbstractShape circle = new Circle(Color.WHITE, 2.0);

        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", rectangle.area()));
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + String.format("%.3f", circle.area()));
    }
}
