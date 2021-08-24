
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
}
