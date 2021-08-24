
public class Person {
	
	private String name;
	private String address;
	
	
	public Person() {
		
		name = null;
		address = null;
	}
	
	public Person(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	/*// Setters
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAddress(String address) {
		
		this.address = address;
	}*/
	
	public void showDetails() {
		
		System.out.println("The Person Name :" +this.name);
		System.out.println("The Person Address :" +this.address);
		
	}

}
