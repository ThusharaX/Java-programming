
public class Student {
	
	private String name;
	private String ditno;
	private String address;
	
	// Default constructor
	public Student() {
		
		name = null;
		ditno = null;
		address = null;
	}
	
	public Student(String name, String ditno, String address) {
		
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}
	
	// Getters
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getDit() {
		return this.ditno;
	}
	
	//Setters
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAddress(String address) {
		
		this.address = address;
	}
	
	public void setDit(String ditno) {
		
		this.ditno =ditno;
	}
	
	

}
