// Exercise 1

/* a) Declare two integer variables, miles and yards, and one double variable for
kilometers
b) Initialize the variables to hold the number of miles and yards in a marathon respectively
(miles to 26 and yards to 385).
c) Write an expression to calculate kilometers from miles and yards.
d) Save the result of the expression in the variable kilometers.
Note: One mile is 1.609 kilometers. There are 1760.0 yards in a mile */

public class Exercise1 { // begining of the class

    public static void main(String[] args) { // Begining of the method

        // Declare given variables

        int miles = 26, yards = 385;
        double kilometers;

        kilometers = (miles * 26) + (yards * 1.609 / 1760); // Calculation of Kilometers

        System.out.print("Kilometers :" + kilometers); // Display Kilometers

    } // End of the method

} // End of the class