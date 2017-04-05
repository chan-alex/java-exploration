package com.chanalex;

interface Shape {

    // All member of an interface are implicitly public.

    // implies this function is public.
    double area();

    // Static methods in interfaces is new in 1.8
    static void info() {
        System.out.println("From Shape interface, info()");
    };
}