abstract class Soldier {

	// Attributes
    private int x;
    private int y;
    
    // abstract class hunt()
    abstract void hunt();

	/**
	 * @return the x
	 */
	public int getXpos() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setXpos(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getYpos() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setYpos(int y) {
		this.y = y;
	}
}

class RedSoldier extends Soldier {
	
	// Implementation of hunt
	public void hunt() {
        System.out.println("Killed using a hand");
        
     // Calling game over
        Board.gameOver();
    }
}

class GreenSoldier extends Soldier {
	
	// Implementation of hunt
    public void hunt() {
        System.out.println("Killed using a knife");
        
     // Calling game over
        Board.gameOver();
    }
}

class BlueSoldier extends Soldier {

	// Implementation of hunt
    public void hunt() {
        System.out.println("Killed using a gun");
        
        // Calling game over
        Board.gameOver();
    }
}
