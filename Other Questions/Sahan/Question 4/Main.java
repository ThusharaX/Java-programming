// Question 04

// Write an application that inputs three integers from the user and displays the sum, average,
// product, smallest and largest of the numbers.

import java.util.*; // Import java Util class


public class Main{ // Beginning of the Main calss

    public static void main(String[] args) { // Beginning of the Method

    Scanner scanner = new Scanner(System.in); //  Create a object for Scanner Calss
    
    System.out.print("Input Number 1 : "); // Input Number 1
    int Number1 = scanner.nextInt(); // User Input Number 1

    System.out.print("Input Number 2 : "); // Input Number 2
    int Number2 = scanner.nextInt(); // User Input Number 2

    System.out.print("Input Number 3 : "); // Input Number 3
    int Number3 = scanner.nextInt(); // User Input Number 3

    int sum = Number1 + Number2 + Number3; // Calculation of three Integer values

    System.out.println("Sum of three Integer Number is : "+sum); // Display the three Integer values

    int average = sum / 3; // Calculate the average value three Integer values

    System.out.println("Average of three Integer Number is : "+average); // Display the average of three Integer values

    if(Number1 > Number2 && Number2 > Number3) { // Check the Condtion

        System.out.println("The Largest Number :" + Number1); // Display the Largest Number
        System.out.println("The Smallest Number :" + Number3); // Display the Smallest Number

    }

    else if (Number1 < Number2 && Number2 > Number3) {  // Check the Condtion

        System.out.println("The Largest Number :" +Number2); // Display the Largest Number
        System.out.println("The Smallest Number" + Number3); // Display the Smallest Number
    }
    else if (Number1< Number2 && Number2 < Number3) { // Check the Condtion

        System.out.println("The Largest Number :" + Number3);  // Display the Largest Number
        System.out.println("The Smallest Number :" +Number1); // Display the Smallest Number

    } 

    } // End of the method

} // End of the Main Class