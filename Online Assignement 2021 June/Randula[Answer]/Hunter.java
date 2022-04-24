package com.dot_hunter;

public class Hunter {
	
	//attributes
	private String name;
	private String color;
	private int x;
	private int y;
	
	//default constructor
	public Hunter() {
		super();
	}

	//overload constructor
	public Hunter(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	//return name
	public String getName() {
		return name;
	}

	//assign name
	public void setName(String name) {
		this.name = name;
	}

	//return color
	public String getColor() {
		return color;
	}

	//assign color
	public void setColor(String color) {
		this.color = color;
	}
	
	//return x value
	public int getxPOS() {
		return x;
	}
		
	//set x value
	public void setxPOS(int x) {
		this.x = x;
	}
		
	//return y value
	public int getyPOS() {
		return y;
	}
		
	//set y value
	public void setyPOS(int y) {
		this.y = y;
	}
	
	//move method
	public void move(Hunter myHunter)
	{
		//handle the exception using try-catch
		try {
			
			//condition checking if the hunter hits the wall
			if(myHunter.x >= 250 || myHunter.y >= 360)
			{
				throw new SoundException("Oh oo!!");
			}
			else {
				System.out.println("Hunter is moving, X:" + myHunter.x + " Y:" + myHunter.y);
			}
			//handle sound exception
		} catch (SoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
	}
	
	//hunt method
	public void hunt(Board myBoard)
	{
		
		//dot type of the board
		String dotType = myBoard.getDotType();
		
		//position of soldiers
		Soldier[] threeSoldiers = myBoard.getThreeSoldiers();
		int x = myBoard.getMyHunter().getxPOS();
		int y = myBoard.getMyHunter().getyPOS();
		
		//game over when all dots are hunted
		if (myBoard.getDots() == 0 && myBoard.getSuperDots() == 0)
		{
			Board.gameOver();
		}
		
		 //Hunter get special power when hunting superDot
        for(int i = 0; i < threeSoldiers.length; i++) {
        	
        	if(x == threeSoldiers[i].getxPOS() && y == threeSoldiers[i].getyPOS()) {
        		
        		//if hunted dot is a normalDot, no soldier gets killed
        		if(dotType.equals("dot")) {
        			Board.gameOver();
        		}
        		
        		//if hunted dot is a superDot, hunter gets special power 
        		//soldier gets killed
        		else if(dotType.equals("superDot")) {
        			System.out.println("Soldier KILLS");
        			
        		}
        	}
        }
        
        //reduce Dot by one
        if(dotType.equals("dot")) {
            myBoard.setDots(myBoard.getDots() - 1);
            System.out.println("Hunting Dots");
        }
        
        //reduce superDot by one
        else if(dotType.equals("superDot")) {
            myBoard.setSuperDots(myBoard.getSuperDots() - 1);
            System.out.println("Hunting Super Dots");
        }
	}
}
