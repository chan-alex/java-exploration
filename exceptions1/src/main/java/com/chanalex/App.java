package com.chanalex;
import java.io.File;
/**
 * Start!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Start:" );

        file_status("/etc/hosts");

        file_status("/etc/does_not_exist");

    }

    public static void file_status(String filename) {

        System.out.println("From file_method method:");

        System.out.println("Trying to check:" + filename);

        // Construct File object from given filename.
        File f = new File(filename);

        if (f.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("It does not exist");
        }




    }
}
