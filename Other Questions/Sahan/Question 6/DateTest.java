// Question 06

// Create a class called Date that includes three pieces of information as instance variables—a
// month (typeint), a day (typeint) and a year (typeint). Your class should have a constructor that
// initializes the three instance variables and assumes that the values provided are correct.
// Provide a set and a get method for each instance variable. Provide a method displayDate that
// displays the month, day and year separated by forward slashes(/). Write a test application
// named DateTest that demonstrates classDate’s capabilities.


import java.util.Scanner; // Import java Scanner Class


public class DateTest{ // Beginning of the Main Class

    public static void main(String[] args) { // Beginning of the Method

    int month, date ,year; // Declare variables
    

    Date d = new Date(); // Create Date Class Object

    Scanner scanner = new Scanner(System.in); // Create of Scanner Calss

    System.out.print("Input Month :"); // Input Month
    month = scanner.nextInt(); // User Input Month
    d.setMonth(month); // Set Input Value

        if(month <= 12) { // Check the month is more than 12

            
        } 
        else {

            System.out.println("Invalid Month"); // if Month more than 12 display invalid month
            
        }

        System.out.print("Input Day :"); // Input Date
        date = scanner.nextInt(); // User Input Date
        d.setDay(date); // Set Input Value

    
            if(date <= 31) { // Check the date is more than 31
    
                
            } 
            else {
    
                System.out.println("Invalid Date"); // if date more than 31 display invalid date
         }

        System.out.print("Input Year :"); // Input Year
        year = scanner.nextInt(); // User Input year
        d.setYear(year); // Set Input Value

        d.DisplyDate(); // Call display method 

    
            
 } // End of the Method



}// End of the Main Class