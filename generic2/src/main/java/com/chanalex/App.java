package com.chanalex;
import java.util.*;

/**
 * Start
 *
 */


interface Shape {
    double area();
}

class Circle implements Shape {
    static double PI = 3.14;
    double radius = 0.0;

    Circle (double r) { this.radius = r; }

    public double area() { return PI * radius * radius;}
}

public class App 
{
    public static void main( String[] args ) {

        System.out.println("Start:");
    
        // The right using diamond syntax "<>".
        // Compiler infers type from left side.
        List<Shape> shapes1 = new ArrayList<>();

        Circle c1 = new Circle(10.0);
        shapes1.add(c1);
        System.out.println(shapes1);

    }
}
