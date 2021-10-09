public class Hunter {
	
	// Attributes
    private String name;
    private String color;
    private int x;
    private int y;
    
    // Hunter overloaded constructor
    public Hunter(String name, String color) {
        this.setName(name);
        this.setColor(color);
    }
    
    /**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

    public void setxPOS(int x) {
        this.x = x;
    }
    public int getxPOS() {
    	return this.x;
    }

    public void setyPOS(int y) {
        this.y = y;
    }
    public int getyPOS() {
    	return this.y;
    }

    // move method
    public void move(Hunter myhunter) {
        
    	// Exception Handling using try-catch
        try {
        	
        	// Checking if hunter hit the wall
            if (myhunter.x >= 250 || myhunter.y >= 360) {
            	
            	// throw an Exception
                throw new SoundException("Oh oo!!");
            }
            else {
                System.out.println("Hunter is moving, X:" + myhunter.x + " Y:" + myhunter.y);
            }
        }
        // Handle SoundException
        catch (SoundException e) {
        	
        	// Print Exception message
            System.out.println(e.getMessage());
        }
    }
    
    // hunt method
    public void hunt(Board myboard) {
    	
    	// dot type of myboard
        String dotType = myboard.getDotType();
        
        Soldier[] threeSoldiers = myboard.getThreeSoldiers();
        int xPOS = myboard.getMyhunter().getxPOS();
        int yPOS = myboard.getMyhunter().getyPOS();
        
        // Game over when all dots are hunted
        if(myboard.getDots() == 0 && myboard.getSuperDots() == 0) {
            Board.gameOver();
        }
        
        // Hunter get super power when hunting superDot
        for(int i = 0; i < threeSoldiers.length; i++) {
        	
        	if(xPOS == threeSoldiers[i].getXpos() && yPOS == threeSoldiers[i].getXpos()) {
        		
        		// if hunted dot is normal dot no super power hunter killed
        		if(dotType == "dot") {
        			Board.gameOver();
        		}
        		
        		// if hunted dot is superDot hunter get super power Soldier killed
        		else if(dotType == "superDot") {
        			System.out.println("Soldier KILLS");
        			
        		}
        	}
        }
        
        // reduce dot by 1
        if(dotType == "dot") {
            myboard.setDots(myboard.getDots() - 1);
            System.out.println("Hunting dots");
        }
        
        // reduce superDot by 1
        else if(dotType == "superDot") {
            myboard.setSuperDots(myboard.getSuperDots() - 1);
            System.out.println("Hunting super dots");
        }
    }
}
