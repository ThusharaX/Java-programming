// Question 03

// Write a program that converts a Fahrenheit degree to Celsius using the formula (input values)


import java.util.*; // Import Java Scanner Class

public class Main{ // Beginnging of the Main Class

    public static void main(String[] args) { // Beginnging of the method

    Scanner scanner = new Scanner(System.in); // Creeate object for Scanner Class

    // Declare variable fahremheit and celsius
    int fahrenheit; 
    int celsius;

    System.out.print("Input Fahrenheit :"); // Input Fahrenheit Values
    fahrenheit = scanner.nextInt(); // User Input

    celsius = (9/5) * (fahrenheit -32); // Calculation

    System.out.print("Celsius :" + celsius); // Display the Converted Celsius Value

 } // end of the method

} // end of the Main Class