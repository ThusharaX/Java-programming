public class Main{ // Main Class

public static void main(String args[]) { // method
    try { // try catch block

        int c[] = {1};
        c[42] = 99;

     } catch (ArrayIndexOutOfBoundsException e) { // exception
        System.out.println("Array index oob: " + e);
        }
    }

}