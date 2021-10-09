import java.util.Random; // Import Random

public class Board { // Begining of the Board class

	// Attributes

	private int dot;
	private int superdot; // int
	private int hunterdot;
	private String DotType;
	Hunter myhunter;
	private Soldier[] threeSoldier;
	

	
	public Board() { // default  Constructor
		
		dot = 0;
	    superdot = 0;
		hunterdot = 0;
	    DotType = null;
		
	}
	
	public Board(String DotType, Hunter myhunter, Soldier[] threeSoldier) { // Overload Constructor
		
		
		this.DotType = DotType;
		this.myhunter = myhunter;
		this.threeSoldier = threeSoldier;
		this.init();

	}
	
	public void setDotType(String DotType) { // Set Dot Type Method
		
		this.DotType = DotType;
	}
	
	public String getDotType() { // Get Dot Type Method
		
		return DotType;
	}
	
	public void setDot(int dot) { // Set Dot 

		this.dot = dot; 
	}

	public int getDot(){ // Get Dot

		return dot;
	}

	public void setSuperDot(int superdot) { // Set Super Dot

		this.superdot = superdot;
	}

	public int getSuperDot(){ // Get Super Dot

		return 3; // Return 3 Super Dot
	}

	public void setHunterDot(int hunterdot) { // Set Hunter Dot

		this.hunterdot = hunterdot;
	}
	
	public int getHunterDot(){ // Get Hunter Dot

		return 97; // Return 97 Hunter Dot
	}

	public void init() { // init Method

		System.out.println("Board is Ready and there soldiers and the hunter is positioned in the board");
		for(int i = 0; i<3; i++) {

			threeSoldier[i].setxPos((int)Math.random()* 250); // Random Values
			threeSoldier[i].setyPos((int)Math.random()* 360);
			
		}

	}
   
} // End of the board class