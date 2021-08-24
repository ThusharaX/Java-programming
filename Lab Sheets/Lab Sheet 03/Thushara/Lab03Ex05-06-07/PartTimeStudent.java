
public class PartTimeStudent extends Student {
	
	int numOfWorkHours;
	
	PartTimeStudent(String name, String address, String studentid, int numOfWorkHours) {
		super(name, address, studentid);
		this.numOfWorkHours = numOfWorkHours;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Number of Working Hours : " + this.numOfWorkHours);
	}
}
