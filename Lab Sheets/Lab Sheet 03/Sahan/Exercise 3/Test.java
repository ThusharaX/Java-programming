public class Test {

	public static void main(String[] args) {
	
		Student s1 = new Student(); // Default constructor
		s1.setName(null);
		s1.setDit(null);
		s1.setAddress(null);
		
		System.out.println("Student Name :" +s1.getName());
		System.out.println("Student ID :" +s1.getDit());
		System.out.println("Student Address :" +s1.getAddress());
		System.out.println("");
		
		Student s2 = new Student();
		
		s2.setName("Amal");
		s2.setDit("IT258963");
		s2.setAddress("Colombo");
		
		System.out.println("Student Name :" +s2.getName());
		System.out.println("Student ID :" +s2.getDit());
		System.out.println("Student Address :" +s2.getAddress());
		
		
	}

}
