// Question 02

// Write a program that input, calculates and prints the product of three integers


import java.util.Scanner; // Import java Scanner class


public class Main{ // Beginning of the Main class
 
    public static void main(String[] args) { // Beginning of the Method

    Scanner scanner = new Scanner(System.in); // Create Object for Scanner Class 

    System.out.print("Input Number 1 :"); // Input Number 1
    int Number1 = scanner.nextInt(); // User Input Number 1

    System.out.print("Input Number 2 :"); // Input Number 2
    int Number2 = scanner.nextInt(); // User Input Number 2

    int sum = Number1 + Number2; // Calculate the Sum of two numbers

    System.out.println("Input First Number is :" + Number1); // Display first Number user input 
    System.out.println("Input Second Number is :" + Number2); // Display second Number user input 
    System.out.println("Calculate of Two Numbers is : " +sum); // Display Calculate of  two Numbers user input 

    } // End of the Method

}// End of the Main class