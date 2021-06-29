// Lecture 01 Exercise 04
/*
    Write a program to input 10 numbers from the keyboard and
    find how many odd numbers and how many even numbers were entered. 
*/

import java.util.Scanner;

public class Exercise4 {
    public static void main(String args[]) {
        int number, evenCount = 0, oddCount = 0, count = 0;

        Scanner myScanner = new Scanner(System.in);

        while (count < 10) {
            System.out.print("Enter Number : ");
            number = myScanner.nextInt();
            if (number % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
            ++count;
        }

        System.out.println("Even Numbers : " + evenCount);
        System.out.println("Odd Numbers : " + oddCount);
    }
}
