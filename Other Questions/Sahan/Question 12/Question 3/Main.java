public class Main { //  Beiginng of the Main Class
public static void main(String[] args) { // Beiginng of the method

        try { // try catch block

        String number = "123a";
        int value = Integer.parseInt(number); // Type Casting

        } catch (NumberFormatException ex) { // Exception

        System.out.println("Wrong number format"); // Display Exception
        }
    } // End of the method
} //  End of the Main Class