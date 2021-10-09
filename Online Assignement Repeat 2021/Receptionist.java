import java.util.Scanner;

class Receptionist extends User implements Calculations{
	
	private int employeeNumber;
	
	
	public Receptionist(String name, String nic, int employeeNumber) {
		super(name, nic);
		this.employeeNumber = employeeNumber;
	}
	

	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}



	@Override
	public void printDetails() {
		super.printDetails();
		
	}


	@Override
	public double calculateRevenue(Counsellor counsellor) {

		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of appointments: ");
	    
	    int noOfAppointments = input.nextInt();
	    double revenue = noOfAppointments * 2500;
	    
	    input.close();
	    return revenue;
	}
}
