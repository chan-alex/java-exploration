package com.chanalex;

public class ColouredCircle extends Circle implements ColouredShape {

    public ColouredCircle(double r) {
        super(r);
    }

    public String getColour() {
        return "No colour yet";
    }
}