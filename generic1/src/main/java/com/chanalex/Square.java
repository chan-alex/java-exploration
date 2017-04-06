package com.chanalex;

public class Square implements Shape {

    double side = 0.0;

    public Square(double side) { this.side = side; }
    public double area() {
        return side * side;
    }
}