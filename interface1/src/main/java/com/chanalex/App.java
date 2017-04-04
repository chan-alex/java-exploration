package com.chanalex;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start: " );

        Circle c1 = new Circle(10);
        double c1_area = c1.area();

        System.out.println("c1_area: " + c1_area);
    }
}
