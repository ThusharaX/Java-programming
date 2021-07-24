import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        EvenOddNumber evenOdd = new EvenOddNumber();
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        if (evenOdd.findEvenOrOdd(num)) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}