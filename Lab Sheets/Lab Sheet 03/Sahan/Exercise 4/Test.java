
public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName(null);
		s1.setDitno(null);
		s1.setAddress(null);

		System.out.println("Student Name :" +s1.getName());
		System.out.println("Student ID :" +s1.getDitno());
		System.out.println("Student Address :" +s1.getAddress());
		System.out.println("");
		
		Student s2 = new Student();
		
		s2.setName("Avishka");
		s2.setAddress("Colombo");
		s2.setDitno("IT258963");
		
		String res = s2.getDetails();
		
		System.out.println(res);
		
	
		
	}

}
