
public class Dog extends Pet {
	private int noOfMasters;
	
	Dog() {}
	
	Dog(String n, String o, int a, int m) {
		super(n, o, a);
		this.noOfMasters = m;
	}
	
	Dog(String n, String o) {
		super(n, o);
		this.noOfMasters = 1;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I am a dog. " +
				"I have " + noOfMasters + " masters at home.");
	}
}
