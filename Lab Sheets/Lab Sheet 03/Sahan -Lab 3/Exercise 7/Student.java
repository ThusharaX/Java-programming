public class Student extends Person {

	private String StudentID;
	
	public Student(String name, String Address, String StudentID) {
		
			super(name,Address);
			this.StudentID = StudentID;
	}
	
	public void showDetails() {
		
		super.showDetails();
		System.out.println("Student ID :" +this.StudentID);
		
	}
	
}
