package com.dot_hunter;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		Scanner scan = new Scanner(System.in);
		Hunter myhunter = new Hunter("Maha Deva" , "Brown");
		Soldier threeSoilders[] = {new RedSoldier() , new RedSoldier() , new GreenSoldier()};
		Board myboard = new Board("superDot" , myhunter , threeSoilders);
		
		System.out.println("Use the keyboard up , down , left , right arrow keys to move the hunter");
		myhunter.setxPOS(scan.nextInt());
		myhunter.setyPOS(scan.nextInt());
		myhunter.move(myhunter);
		myhunter.hunt(myboard);
		threeSoilders[2].hunt();
	}
}
