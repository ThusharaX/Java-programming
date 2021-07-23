// Exercise 3

/* Write a program to calculate the volume of a cube when length, width and height are
given as keyboard inputs. */

import java.util.Scanner; // Use java Scanner package

public class Exercise3 { // Begining of the class

    public static void main(String[] args) { // Begining of the method

        int length, width, height, volume; // Declare variable

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Cube : ");
        length = sc.nextInt();

        System.out.print("Enter the Width of Cube :");
        width = sc.nextInt();

        System.out.print("Enter the Height of the Cube :");
        height = sc.nextInt();

        volume = length * width * height;

        System.out.print("The Volume of the Cube is :" + volume);

    } // End of the Method

} // End of the class