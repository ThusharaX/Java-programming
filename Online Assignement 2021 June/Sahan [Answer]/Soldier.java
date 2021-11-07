
public class Soldier { // Soldier class 


	private int xPos;
	private int yPos;
	

	public Soldier() {

		xPos = 0;
		yPos = 0;
	}

	public Soldier(int xPos, int yPos) {

		this.xPos = xPos;
		this.yPos = yPos;

	}


	public void setxPos(int xPos) { // Set x pos
		
		this.xPos = xPos;
	}
	
	public int getxPos() { // get x pos
		
		return xPos;
	}
	
	public void setyPos(int yPos) { // set Y pos
		
		this.yPos = yPos;
	}
	
	public int getyPos() { // get Y pos
		
		return yPos;
	}

	public void hunt() {};
	
	
} // End of the Soldier class