package com.chanalex;
import java.util.*;

/**
 * Start
 *
 */


class Square implements Shape {

    double side = 0.0;

    Square (double s) { this.side = s; }

    public double area() { return side * side;}
}



public class App2 {

    public static void main( String[] args  ) {
        System.out.println("testing");

        List Shapes = new ArrayList();
        Shapes.add(new Square(1));
        Shapes.add(new Square(2));
        Shapes.add(new Circle(3));

        Square sq1 = (Square)Shapes.get(0);
        Square sq2 = (Square)Shapes.get(1);
        Shapes sq3 = (Square)Shapes.get(2);

    }

}