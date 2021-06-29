// Lecture 01 Exercise 03
/*
    WWrite a program to input 3 integers and print the largest and
    the smallest of the 3 numbers entered.
*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String args[]) {
        int max = 0, min = 0, num = 0, count = 1;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter Number : ");
        max = myScanner.nextInt();
        min = max;
        while(count < 3) {
            System.out.print("Enter Number : ");
            num = myScanner.nextInt();
            if(num > max) {
                max = num;
            }
            else if(num < min) {
                min = num;
            }
            count++;
        }

        System.out.println("Largest Number = " + max);
        System.out.println("Smallest Number = " + min);

    }
}
