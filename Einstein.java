import java.util.Scanner;

/**
* Java program to demonstrate working Logging in Java.
*
* @author Navin
* @version 1.0
* @since 2023-02-14
*/

public final class Einstein { 

    static final double light = 299792458; 
    /**
    * Main lines of code.
    *
    *
    * @exception IllegalStateException Utility Class
    * @see IllegalStateException
    */
    private Einstein() {
        throw new IllegalStateException("Utility Class");
    }

    /**
    * Main lines of code.
    *
    *
    * @param args placeholder
    */
    public static void main(String[] args) {

        // Using Scanner for Getting Input from User
        System.out.println("Enter the mass of your object : ");

        final Scanner scanner = new Scanner(System.in);

        // get the radius as a string
        final String massString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double mass = Double.parseDouble(massString);

            // check if negative
            if (mass >= 0) {
                // math
                double energy = mass * Math.pow(light,2); 

                 // Print energy total  
                System.out.format("The energy of your mass is %.3f ", energy);
                System.out.println(" J ");
            } else {
                System.out.println("This is an invalid input");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid mass. "
                + error.getMessage());
        }

        // Closing Scanner
        scanner.close();
    }
}
