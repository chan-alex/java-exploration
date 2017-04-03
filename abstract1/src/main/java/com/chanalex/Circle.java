package com.chanalex;

public class Circle extends Shape {

    public static final double PI = 3.1415;
    protected double r;

    public Circle(double r)  { this.r = r; }
    public double area() {
        return PI * r * r;
    }


}