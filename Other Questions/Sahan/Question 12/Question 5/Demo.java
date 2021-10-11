import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {

        int number;

        EvenOddNumber eon = new EvenOddNumber();

        // boolean result = eon.findEvenOrOdd(8);

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader bf = new BufferedReader(isr);

        System.out.print("Enter the number :");
        number = Integer.parseInt(bf.readLine());

        if (eon.findEvenOrOdd(number)) { // if(result == true)

            System.out.print("This is an Even Number");

        }

        else {

            System.out.print("This is an Odd Number");

        }

    }

}