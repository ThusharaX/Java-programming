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
	
	public String getName() {
		return name;
	}
	
	public String getDitno() {
		return ditno;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setDitno(String ditno) {
		this.ditno = ditno;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDetails() {
		
		String details = "I am a Student. \nMy name is "+this.name+". \nI am from "+this.address+ ". \nMy dit no is "+this.ditno;
		return details;
	}
	
	
}
