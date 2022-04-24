package com.dot_hunter;

public class GreenSoldier extends Soldier{
	
	
	public GreenSoldier() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void hunt() {
		// TODO Auto-generated method stub
		System.out.println("Killed using a gun");
		
		//call game over
		Board.gameOver();
	}

}
