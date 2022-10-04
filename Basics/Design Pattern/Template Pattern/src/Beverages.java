
public abstract class Beverages {

	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		
		System.out.println("Pour into cup");
	}
	
	
	public void PrepareRecipie() {
		
		boilWater();
		brew();
		addCondiments();
		pourInCup();
		
	}
	
}
