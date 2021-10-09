import java.util.Scanner;

public class Assignment_1_implement_atm {
 public static void main(String args[])
 
 {
	 int choice;
		int balance = 6000;
		int num1;
		int pin=1000, newpin;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your pin");
		newpin = sc.nextInt();
		
		if (pin == newpin)
		{
			System.out.println("Pin is correct");
		}
		
		else
		{
			System.out.println("Pin is Incorrect");
		}
				
		
		int num2;
				
		
		System.out.println("1.Balance Enquiry");
		
		System.out.println("2.Cash Deposite");
		
		System.out.println("3.Cash Withdrawl");
		
		System.out.println("4.Pin change");
		
			
        System.out.println("Enter your choice");
        choice = sc.nextInt();
		
		
		switch(choice)
		{
		case 1 :{
		
		System.out.println("Your Current balance is " + balance);
		}
		break;
		
	   case 2 :{
	   
	    System.out.println("Enter the amount");
	    num1 = sc.nextInt();
	    balance = balance + num1;
	    System.out.println("The current balance is " + balance); 
	    
	    
	    }
	    break;
	    
	   case 3 :{
		
		System.out.println("Enter the amount");
		num1 = sc.nextInt();
		balance = balance - num1;
		System.out.println("The current balance is " + balance); 
	   }
		break;
		
	   case 4 :{
		
		System.out.println("Enter the current print");
		System.out.println("Enter new pin");
		newpin= sc.nextInt();
		pin=newpin;
		}
		break;
		
		}
		
	}

	}

