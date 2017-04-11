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
        System.out.println(shapes1.get(0));

        System.out.println("Testing type erasure:");
        List just_a_list = new ArrayList();

        // Unsafe type casting.
        // Implies List<Shape> compatible with List.
        // Achieve type erasure.
        // The generic type is only visible during runtime.
        // Not reflected in bytecode.
        List<Shape> shapes2 = (List<Shape>)just_a_list;
        System.out.println(shapes2);


    }
}
