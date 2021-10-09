// Write a simple program that calculates the square root of a number (Math.sqrt()).
// Identify the exception that can occur and write code to handle this using a try catch block.


import java.util.InputMismatchException; // Import InputMismatchException
import java.util.Scanner; // Import the Scanner class

public class Main { // Main class

    public static void main(String[] args) { // main method
        
        
        Scanner input = new Scanner(System.in); // Create a scanner object
        
        try {
            System.out.print("Enter a number: "); // Prompt the user to enter a number
            double num = input.nextDouble(); // Store the number entered by the user

            double sqrt = Math.sqrt(num); // Calculate the square root of the number

            if(Double.isNaN(sqrt)) { // If the number is not a number
                throw new ArithmeticException("Answer unreal"); // Throw an exception
            }

            System.out.println("The square root of " + num + " is " + sqrt); // Print the answer
        }

        catch (InputMismatchException e) { // If the user enters a non-numeric value
            System.out.println(e); // Print the exception
            System.out.println("Invalid input"); // Print an error message
        }

        catch (ArithmeticException e) { // If the number is not a number
            System.out.println(e.getMessage()); // Print the exception
        }
        
        input.close(); // Close the scanner object
    }
}