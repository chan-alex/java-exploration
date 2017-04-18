package com.chanalex;

/**
 * Start
 *
 */
public class App 
{
    static final int limit = 10;

    public static void main( String[] args ) {

        System.out.println( "Start" );
        int test_value = 15;

        System.out.println("Before asserts");
        //assert true;
        //assert(test_value > limit);
        assert(test_value > 5);
        //if (test_value > limit)
        //   throw new AssertionError("fatal error: 42");

        System.out.println("After asserts");




    }
}
