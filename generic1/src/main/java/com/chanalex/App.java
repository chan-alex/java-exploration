package com.chanalex;

import java.util.*;

/**
 * Start
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Start:" );


        Square s1 = new Square(10.0);
        System.out.println(s1.area());

        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(s1);
        Square s2 = new Square(5.0);
        shapes.add(s2);

        System.out.println(shapes.get(1).area());
    }
}
