package com.chanalex;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Start");

    }

    public static void taking_apart_strings() {

        System.out.println("From taking_apart_strings: ");
        String str = "Java has a lot of strings.";

        System.out.println("Starting str =" + str);

        System.out.println("str.substring(5) = " + str.substring(5));


    }
}


// The String class is final and cannot be extended/inherited.
// The below will not compile.
// The error is "error: cannot inherit from final String"

//class myString extends java.lang.String {
//
//    public void setCharAt(int index, char character) {
//
//   }
//}

