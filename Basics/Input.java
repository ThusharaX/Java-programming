import java.util.Scanner;   // Import the Scanner class

public class Input {
    public static void main(String args[]) {
        // Variable declaration
        String name;
        int age;

        // Create a Scanner object
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = myScanner.nextLine();    // Read user input - String(with all white spaces)
        System.out.print("Enter your age : ");
        age = myScanner.nextInt();  // Read user input - Int

        // Output user input
        System.out.println(name);
        System.out.println(age);
    }
}

/*
    Method          Description
    
    nextBoolean()   Reads a boolean value from the user
    nextByte()      Reads a byte value from the user
    nextDouble() 	Reads a double value from the user
    nextFloat() 	Reads a float value from the user
    nextInt()       Reads a int value from the user
    nextLine() 	    Reads a String value from the user
    nextLong() 	    Reads a long value from the user
    nextShort() 	Reads a short value from the user
*/