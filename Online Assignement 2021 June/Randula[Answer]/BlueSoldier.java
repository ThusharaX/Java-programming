package com.dot_hunter;

public class BlueSoldier extends Soldier{

	
	
	public BlueSoldier() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void hunt() {
		// TODO Auto-generated method stub
		System.out.println("Killed using a knife");
		
		//call game over
		Board.gameOver();
	}

}
