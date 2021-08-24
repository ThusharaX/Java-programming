
public class Person {

	private String name;
	private String address;
	
	public Person() {
		
		name = null;
		address = null;
		
	}
	
	public Person(String pName, String pAddress) {
		
		this.name = pName;
		this.address = pAddress;
		
	}
	
	public void showDetails() {
		
		System.out.println("Name :" +this.name);
		System.out.println("Address :" +this.address);
		
	}
	
	
	
}
