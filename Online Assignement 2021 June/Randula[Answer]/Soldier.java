package com.dot_hunter;

abstract class Soldier {
	
	//attributes
	private int x;
	private int y;
	
	//define abstract method
	abstract void hunt();
	
	public Soldier()
	{
		x = 0;
		y = 0;
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
		//y = 6;
	}
	
	
	
}
