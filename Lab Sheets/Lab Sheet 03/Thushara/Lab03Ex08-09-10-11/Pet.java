
public class Pet {
	private String name;
	private String owner;
	private int age;
	
	Pet() {}
	
	// create a newborn pet object
	Pet(String n, String o) {
		this.name = n;
		this.owner = o;
		this.age = 0;
	}
	
	public Pet(String n, String o, int a) {
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	public void showDetails(){
		System.out.println("I am a pet. My name is "
		 + this.name + ". My owner is " + this.owner);
	}
}//end of the pet class