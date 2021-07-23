import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Lab2Ex4 {
    public static void main(String[] args) throws IOException{
        int width,length,height,volume;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the width of the box: ");
        width = Integer.parseInt(br.readLine());
        System.out.print("Enter the length of the box: ");
        length = Integer.parseInt(br.readLine());
        System.out.print("Enter the height of the box: ");
        height = Integer.parseInt(br.readLine());
        volume = width * length * height;
        System.out.print("The volume of the box is: " + volume);
    }
}