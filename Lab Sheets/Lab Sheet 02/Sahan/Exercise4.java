import java.io.*;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        int length, width, height, volume;

        InputStreamReader isr = new InputStreamReader(System.in);

        // BufferedReader in = new BufferedReader(isr);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Length of the Cube :");
        length = Integer.parseInt(in.readLine());

        System.out.print("Enter the Width of the Cube :");
        width = Integer.parseInt(in.readLine());

        System.out.print("Enter the Height of the Cube :");
        height = Integer.parseInt(in.readLine());

        volume = length * width * height;

        System.out.print("The Volume is :" + volume);

    }

}