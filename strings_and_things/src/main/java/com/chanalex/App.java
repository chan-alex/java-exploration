package com.chanalex;


import java.util.StringTokenizer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Start");

        taking_apart_strings();
        breaking_string_into_words();

    }

    public static void taking_apart_strings() {

        // using String substring() method
        System.out.println("From taking_apart_strings(): ");
        String str = "Java has a lot of strings.";

        System.out.println("Starting str =" + str + "\n");

        System.out.println("str.substring(5) = " + str.substring(5));
        System.out.println("str.substring(5) = " + str.substring(7,12));


    }

    public static void breaking_string_into_words() {

        System.out.println("\nFrom breaking_string_into_words(): ");
        String str = "Java has a lot of strings.";


        // Easy way is to use the .split method.
        // for(String word: str.split(" ")) {
        //     System.out.print(word);
        // }

        // Use java.util.StringTokenizer
        // By default, break as standard word boundaries.
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println("Token = " + st.nextToken());
        }

        System.out.println("\nBreaking string other character as line serparator:");
        String str2 = "Java|has|a|lot|of|strings";
        StringTokenizer st2 = new StringTokenizer(str2, "|");
        while (st2.hasMoreElements()) {
            System.out.println("Token =" + st2.nextElement());
        }

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

