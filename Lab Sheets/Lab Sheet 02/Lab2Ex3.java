import java.util.Scanner;
public class Lab2Ex3 {    
    public static void main(String[] args) {
        int width,length,height,volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the cube: ");
        width = input.nextInt();
        System.out.print("Enter the length of the cube: ");
        length = input.nextInt();
        System.out.print("Enter the height of the cube: ");
        height = input.nextInt();   
        input.close();
        volume = width * length * height;
        System.out.println("The volume of the cube is: " + volume); 
    }
}