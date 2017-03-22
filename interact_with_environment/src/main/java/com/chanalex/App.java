package com.chanalex;



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

    }
}
