/*  Write a Java program to add two integers and display the sum and the average of two Integers.
    Declare two integer variables to store the numbers to be added.
*/

class Lab1Ex7 {
    public static void main(String[] args) {
        
        // Declare two integer variables to store the numbers to be added or find average.
        int num1 = 4, num2 = 6;

        // Call the method to add two integers
        System.out.println("Sum = " + sum(num1, num2));
        
        // Call the method to find average of two integers
        System.out.println("Average = " + average(num1, num2));

    }

    // Method to add two integers
    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Method to find the average of two integers
    private static int average(int num1, int num2) {
        return sum(num1, num2) / 2;
    }
}

// </Thushara Thiwanka>