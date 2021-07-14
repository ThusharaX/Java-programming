/*  Write a program to display the day of the week when you provide the value.
        Expected Output:
            Value of the day : 4
            Day of the week : Thursday
            Good Bye!
    
    You must use “switch –case” statement.
    Display “Invalid Day” when some invalid value is provided.
*/

import java.util.Scanner;   // Import the Scanner class

public class Lab1Ex4 {
    public static void main(String[] args) {

        int day;
        
        // Create a Scanner object
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Value of the day : ");
        day = myScanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}

// </Thushara Thiwanka>