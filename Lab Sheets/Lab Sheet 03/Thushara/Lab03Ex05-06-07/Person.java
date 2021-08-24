
public class Person {
	String name;
	String address;
	
	Person() {};
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void showDetails() {
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
	}
}
