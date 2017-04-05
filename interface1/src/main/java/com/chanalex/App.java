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

        System.out.println("c1 area: ");
        print_area(c1);

        // Calling the default implementation of abcd()
        System.out.println("c1.abcd(): " + c1.abcd());

        ColouredCircle cc1 = new ColouredCircle(10);

        System.out.println("cc1 area: ");
        print_area(cc1);

        System.out.println("cc1 colour: " + cc1.getColour());

        // Calling the default implementation of abcd()
        System.out.println("cc1.abcd(): " + cc1.abcd());
    }


    private static void print_area(Shape s) {
        System.out.println("Area of this shape is: " + s.area());
    }
}
