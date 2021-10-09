public class Board {
	
	// Attributes
    private String dotType;
    private int dots;
    private int superDots;
    private Hunter myhunter;
    private Soldier[] threeSoldiers;
    
    /**
	 * @return the dotType
	 */
	public String getDotType() {
		return dotType;
	}

	/**
	 * @param dotType the dotType to set
	 */
	public void setDotType(String dotType) {
		this.dotType = dotType;
	}

	/**
	 * @return the dots
	 */
	public int getDots() {
		return dots;
	}

	/**
	 * @param dots the dots to set
	 */
	public void setDots(int dots) {
		this.dots = dots;
	}

	/**
	 * @return the superDots
	 */
	public int getSuperDots() {
		return superDots;
	}

	/**
	 * @param superDots the superDots to set
	 */
	public void setSuperDots(int superDots) {
		this.superDots = superDots;
	}
	
	/**
	 * @return the myhunter
	 */
	public Hunter getMyhunter() {
		return myhunter;
	}

	/**
	 * @param myhunter the myhunter to set
	 */
	public void setMyhunter(Hunter myhunter) {
		this.myhunter = myhunter;
	}
	
	// Set threeSoldiers[]
	public Soldier[] getThreeSoldiers() {
	     return this.threeSoldiers;
	 }
	
	// Initialization
    public void init() {
    	
    	// Set initial values for dots and superDots
        this.setDots(97);
        this.setSuperDots(3);

        // Set Soldier positions
        // Looping on threeSoldiers[]
        for(int i = 0; i < threeSoldiers.length; i++) {
        	
        	// Generating random number for X and Y 
        	// Using Math.random
        	// Range for X = 250, Y = 360
        	threeSoldiers[i].setXpos((int) (Math.random() * 250));
            threeSoldiers[i].setYpos((int) (Math.random() * 360));
        }
        
        // Set Hunter Positions
        myhunter.setxPOS(0);
        myhunter.setyPOS(0);
        
        // Prompt
        System.out.println("Board is ready and three soldiers and the hunter is positioned in the board");
    }

    public Board(String dotType, Hunter myhunter, Soldier[] threeSoldiers) {
    	
    	// Set Values
    	this.setDotType(dotType);
        this.setMyhunter(myhunter);
        this.threeSoldiers = threeSoldiers;
        
        init();
    }
    
    // Game Over method
    public static void gameOver() {
    	
    	// Prompt
        System.out.println("Game over");
        
        // Exit from program
        System.exit(0);
    }
}
