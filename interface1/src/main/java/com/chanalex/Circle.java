package com.chanalex;

public class Circle implements Shape {

    static final double PI = 3.14;
    double r = 0.0;

    Circle() {this.r = 0.0;}
    Circle(double r)  { this.r = r; }

    // must declare public or cannot compile.
    public double area()  { return Circle.PI * this.r * this.r; }

}