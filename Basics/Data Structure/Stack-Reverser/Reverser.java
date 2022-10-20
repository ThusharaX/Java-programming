package Stack;

import java.util.Scanner;

public class Reverser {
	private String input,output;

    Reverser(String input){
        this.input = input;
        output = "";
    }

    public String reverse(){
        StackX stack = new StackX(input.length());

        for (char letter : input.toCharArray()) {
            stack.push(letter);
        }



        while (!stack.isEmpty()) {
            output += stack.pop();

        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any text : ");
        String str = sc.nextLine();
        Reverser obj = new Reverser(str);
        System.out.println("Reversed  :" + obj.reverse()); 
        sc.close();
    }
}
