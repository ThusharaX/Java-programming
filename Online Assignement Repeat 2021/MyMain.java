public class MyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Receptionist rs = new Receptionist("Thushara","981234567V", 1);
		
		Counsellor co = new Counsellor("Thiwanka", "981234567V", "thiwanka@gmail.com", "Neurologist");
		co.addHospital("Osro Hospitals (Pvt) Ltd");
		co.addHospital("Lanka Hospitals");
		co.addHospital("Royal Hospital");
		co.addHospital("Nawaloka Hospital");
		co.addHospital("Asiri Surgical Hospital");
		
		double revenue = rs.calculateRevenue(co);
		System.out.println("Revenue for " + co.getName() + " : " + revenue + "\n");
		
		rs.printDetails();
		System.out.println();
		
		co.printDetails();
	}
}
