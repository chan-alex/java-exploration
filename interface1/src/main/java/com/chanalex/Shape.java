package com.chanalex;

interface Shape {

    // All member of an interface are implicitly public.

    double area();

    // New in 1.8
    // Interfaces can implement default implementations of methods.
    default String abcd() { return "Default implementation of abcd()"; };

    // New in 1.8
    // Static methods in interfaces are new in 1.8
    static void info() {
        System.out.println("From Shape interface, info()");
    };
}