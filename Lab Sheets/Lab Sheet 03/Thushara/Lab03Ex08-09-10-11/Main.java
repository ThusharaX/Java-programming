
public class Main {
	
	public static void main(String[] args){
	
		Pet p = new Pet("Lissie","Smith",3);
		p.showDetails();
		
		Cat c = new Cat("Kyan", "Silva", 4, 4);
		c.showDetails();
		
		// New born Pet
		Pet p1 = new Pet("Roxy", "John");
		p1.showDetails();
		
		// New born Cat
		Cat c1 = new Cat("Kitty", "Jack");
		c1.showDetails();
		
		// New born Dog
		Dog d1 = new Dog("Siba", "Harry");
		
		// Dog with 2 age & 5 masters
		Dog d2 = new Dog("Rinky", "Ron", 2, 5);
		
		d1.showDetails();
		d2.showDetails();
		
		Pet p3 = c;
		p3.showDetails();
	}
}//end of the demo class
