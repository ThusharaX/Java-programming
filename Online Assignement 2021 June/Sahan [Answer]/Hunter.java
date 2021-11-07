public class Hunter { // Beginiing of the Hunter class 

	// Attributes
	
	private String name; 
	private String color;
	private int xPos;
	private int yPos;
		
	public Hunter() { // Default Constructor
		
		name = null;
		color = null;
		xPos = 0;
		yPos = 0;
	}
	
	
	public Hunter(String name, String color) { // Overload Constructor
		
		this.name = name;
		this.color = color;
	}
	
	public void setxPos(int xPos) { // Set X Pos Method
		
		this.xPos = xPos;
	}
	
	public int getxpos() {
	
		return xPos;
	}
	
	public void setyPos(int yPos) { // Set Y Pos Method
		
		this.yPos =yPos;
	}
	
	public int getyPos() {
		
		return yPos;
	}

	
	public void move(Hunter myhunter)throws SoundException { // Move Method and Sound Exception
		
		
		if(myhunter.xPos<1 || myhunter.xPos >= 250 || myhunter.yPos < 1 || myhunter.yPos >=360) { // if condition for x axis and y axis
			
		System.out.println("Hunter is moving, " + "x :" +myhunter.xPos+ " Y :" +myhunter.yPos);
		
		throw new SoundException("Oh oo!");	 // Throw Sound Exception
		
		}
		
		else {
			
			System.out.println("Hunter is moving, X: " +myhunter.xPos + " Y :" +myhunter.yPos);
		} 
	}
	
	    public void hunt(Board myboard, String dotType ) { // Hunt Method
		
		if(dotType == "superDot") { // Condition for Super 

			System.out.println("Hunting super dots");
			myboard.setDot(myboard.getDot() -1);
			if(myboard.getSuperDot() == 0 && myboard.getDot() == 0){
				System.out.println("Game Over, You Win");
			}
		}

		else if(dotType == "hunterdot") { // Condition for hunter dots
			System.out.println("Hunting hunter dots");
			myboard.setDot(myboard.getDot() -1);
			if(myboard.getSuperDot() == 0 && myboard.getDot() == 0) {
				System.out.println("Game Over, You Win");
				System.exit(0);
			}

		}
		
		
	}


} // End of the Hunt class
