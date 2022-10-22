package Stack;

import java.util.Scanner;

public class Paranthesizer {
	static String expr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your expression : ");
        expr = sc.nextLine();
        boolean res = checker();
        System.out.println(res?"Valid Expression":"Invalid Expression");
        sc.close();
    }

    public static int countParanthesis(){
        int count = 0;
        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '[') {
                count++;
            }
        }

        return count;
    }

    public static boolean checker(){
        StackX stk = new StackX(countParanthesis());

        for (char element : expr.toCharArray()) {
            if(element == '(' || element == '{' || element == '['){
                stk.push(element);
            }
            
            if (element == ')' && stk.peek() == '(') {
                stk.pop();
            }else if (element == '}' && stk.peek() == '{') {
                stk.pop();
            }else if (element == ']' && stk.peek() == '[') {
                stk.pop();
            }
        }

        return stk.isEmpty();
    }
}
