package com.chanalex;

import java.util.Scanner;
/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Start: " );
        ask_input1();

    }


    public static void ask_input1( ) {

        // One way to do it:
        // System.in is the standard input stream.
        // By itself, only has method to read bytes.
        // To read strings and number, use a scanner.

        System.out.println("From ask_input():");

        Scanner in1 = new java.util.Scanner(System.in);

        System.out.println("Input your name:");
        String name = in1.nextLine();

        System.out.println("Name = " + name);
    }
}
