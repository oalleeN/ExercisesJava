package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice cd = new ComboDevice("2081");
        cd.processDoc("My dissertation");
        cd.print("My dissertation");
        System.out.println("Scan result: " + cd.scan());

    }
}
