
public class Person {

	private String name;
	private String Address;
	
	public Person() {
		
		name = null;
		Address = null;
	}
	
	public Person(String name, String Address) {
		
		this.name = name;
		this.Address = Address;
	}
	
	public void showDetails() {
		
		System.out.println("Name :" +this.name);
		System.out.println("Address :" +this.Address);
		
	}
	
}
