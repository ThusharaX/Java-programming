
public class Student extends Person {
	
	String studentid;
	
	Student() {}
	Student(String name, String address, String studentid) {
		super(name, address);
		this.studentid = studentid;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Student ID : " + this.studentid);
	}
}
