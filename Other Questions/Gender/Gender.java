package c_10_String_Assignment;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) 
	{
	   String str;
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name = ");
		str = sc.next();
		
		char ch = str.charAt(str.length()-1);
		
		if(ch == 'a'  || ch =='u' || ch =='i')
		{
			System.out.println("It is Girl");
		}
		
		else
		{
			System.out.println("It is Boy");
		}
	}
}
