package com.chanalex;


import java.util.Properties;

/**
 * Interact with environments
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "App: Start!" );

        getenv();
        system_properties();
    }

    public static void getenv( ) {

        // System.getenv() is used to query environment variables.

        System.out.println("From getenv():");

        String PATH_env = System.getenv("PATH");

        System.out.println("THe PATH env variable is::");
        System.out.println(PATH_env);
    }

    public static void system_properties() {

        // Use System.getProperty to get system property values.
        // In this case is -Dperson_name="<the name>"

        System.out.println("From system_properties():");
        String person_name = System.getProperty("person_name");

        if (person_name == null) {
            System.out.println("person_name property is not set.");
        } else {
            System.out.println("person_name property value = " + person_name);
        }

        // Some system properties are pre-defined.
        // This one return the java version in use.
        String java_ver = System.getProperty("java.specification.version");
        System.out.println("Java_ver = " + java_ver);

        //System.getProperties returns all properties.
        System.getProperties().list(System.out);

    }
}
