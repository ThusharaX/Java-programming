public class PartTimeStudent extends Student{

	private int workHours;
	
	public PartTimeStudent(String name, String Address, String StudentID, int workHours) {
		
		super(name, Address, StudentID);
		this.workHours = workHours;
	}
	
	public void showDetails() {
		
		super.showDetails();
		System.out.println("Working Hours :" +this.workHours);
		
	}
	
	
	
}
