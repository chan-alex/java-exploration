package com.chanalex;

// This interface extends an existing interface.
// When an interface extends another interface, it inherits all the
// constants and methods.
interface ColouredShape extends Shape {

    String getColour();
}