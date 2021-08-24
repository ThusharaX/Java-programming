
public class Student extends Person{

	private String StudentID;
	
	
	public Student(String pName, String pAddress, String StudentID) {
		
		super(pName, pAddress);
		this.StudentID = StudentID;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Student ID :" +this.StudentID);
		
		
	}
	
}
