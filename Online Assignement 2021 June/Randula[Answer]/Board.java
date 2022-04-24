package com.dot_hunter;

public class Board {
	
	//attributes
	private int dots;
	private int superDots;
	private String dotType;
	private Hunter myHunter;
	private Soldier[] threeSoldiers;
	
	//return Dots
	public int getDots() {
		return dots;
	}

	//assign Dots
	public void setDots(int dots) {
		this.dots = dots;
	}

	//return Super Dots
	public int getSuperDots() {
		return superDots;
	}

	//assign Super Dots
	public void setSuperDots(int superDots) {
		this.superDots = superDots;
	}

	//return Dot Type
	public String getDotType() {
		return dotType;
	}

	//assign Dot Type
	public void setDotType(String dotType) {
		this.dotType = dotType;
	}

	//return MyHunter
	public Hunter getMyHunter() {
		return myHunter;
	}

	//assign MyHunter
	public void setMyHunter(Hunter myHunter) {
		this.myHunter = myHunter;
	}

	//return Three Solders
	public Soldier[] getThreeSoldiers() {
		return threeSoldiers;
	}

	//
	public void setThreeSoilders(Soldier[] threeSoilders) {
		this.threeSoldiers = threeSoilders;
	}

	public Board(String dotType, Hunter myHunter, Soldier[] threeSoldiers) {
		
		super();
		this.dotType = dotType;
		this.myHunter = myHunter;
		this.threeSoldiers = threeSoldiers;
		
		this.init();
	}
	
	public void init() {
		
		//set initial values for Dots and Super Dots
		this.setDots(97);
		this.setSuperDots(3);
		
		//set soldiers' positions
		//generate a random number using Math.random function
		for (int i = 0 ; i < threeSoldiers.length ; i++)
		{
			threeSoldiers[i].setxPOS((int) Math.random() * 250);
			threeSoldiers[i].setyPOS((int) Math.random() * 360);
			
		}
		
		//set hunter positions
		myHunter.setxPOS(0);
		myHunter.setyPOS(0);
		
		//prompt as ready
		System.out.println("Board is ready and three soldiers and the hunter is positioned in the board");
	}
	
	//game over method
	public static void gameOver(){
		
		//Prompt
		System.out.println("Game Over");
		
		//Terminate the program
		System.exit(0);
	}
}
