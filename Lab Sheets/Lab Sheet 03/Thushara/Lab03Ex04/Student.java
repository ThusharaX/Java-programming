
public class Student {
	private String name;
	private String ditno;
	private String address;
	 
	 Student(String name, String ditno, String address) {
		 this.name = name;
		 this.ditno = ditno;
		 this.address = address;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 public String getAddress() {
		 return this.address;
	 }
	 public String getDit() {
		 return this.ditno;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public void setDit(String ditno) {
		 this.ditno = ditno;
	 }
	 
	 public String getDetails() {
		 String details = 
				 "I am a Student.\r\n"
		 		+ "My name is " + this.name + ".\r\n"
		 		+ "I am from " + this.address + ".\r\n"
		 		+ "My dit no is " + this.ditno;
		 return details;
	 }
}
