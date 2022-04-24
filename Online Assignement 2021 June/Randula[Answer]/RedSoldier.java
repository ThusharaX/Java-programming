package com.dot_hunter;

public class RedSoldier extends Soldier{

	
	public RedSoldier() {
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
