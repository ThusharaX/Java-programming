import java.util.ArrayList;

class Counsellor extends User {
	
	private String email;
	private String specialistArea;
	private ArrayList<String> arrivalHospitalList = new ArrayList<>();
	
	
	public Counsellor(String name, String nic, String email, String specialistArea) {
		super(name, nic);
		this.email = email;
		this.specialistArea = specialistArea;
	}


	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Email: " + email);
		System.out.println("Specialist Area: " + specialistArea);
		System.out.println("Hospital List: ");
		printHospital();
	}
	
	public void addHospital(String hospitalName) {
		
		arrivalHospitalList.add(hospitalName);
	}
	
	public void printHospital() {
		for (int i = 0; i < arrivalHospitalList.size(); i++) {
			System.out.println("\t" + arrivalHospitalList.get(i));
		}
	}
}
