// Lecture 01 Exercise 02
/*
    Write a java program to input the length and the width of a rectangle and
    calculate and print the perimeter.
*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[]) {
        float length, width;
        float perimeter = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter length : ");
        length = myScanner.nextFloat();
        System.out.print("Enter width : ");
        width = myScanner.nextFloat();

        perimeter = (length + width) * 2;

        System.out.println("Perimeter = " + perimeter);
    }
}
