package com.chanalex;
import java.io.*;

import java.util.zip.ZipException;
import javax.net.ssl.SSLException;
/**
 * Start!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Start:" );

        // Because the open_file() throws exceptions, It
        // must be handled in the try/catch block.
        try {

            open_file("/etc/hosts");
            open_file("/etc/does_not_exist");
            System.out.println("Code should not reach here.");

        } catch ( FileNotFoundException e) {

            System.out.println(e);
        }
        //   1) New in java 7: catch mutiple exeception in a catch clause
        //   2) Java also does not allow catching exceptions that has no possbility for being thrown.
        //} catch ( ZipException | SSLException e ) {
           // System.out.println("Probably should not reach here. Just for demo purposes.");
        //}
        finally {

            // All code in the finally clause are guarenteed to executed no matter
            // how control leaves the try clause.
            System.out.println("Calling from the finally block.");

        }

        System.out.println("End.");
    }

    // This method does not throws any exceptions.
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

    // This method calls codes that throws FileNotFoundException exceptions
    // and so must have a "throws" clause in the declaration.
    public static void open_file(String filename) throws FileNotFoundException {

        BufferedReader is = new BufferedReader(new FileReader(filename));

    }
}
