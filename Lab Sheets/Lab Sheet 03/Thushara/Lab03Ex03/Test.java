/*	Accessor and Mutator Methods
	(Getters and Setters)
*/

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student("Thushara", "DIT/11/C1/0010", "Colombo");
		Student s2 = new Student("Thiwanka", "DIT/11/C1/0020", "Kandy");
		
		s1.setName("Kasun");
		s1.setDit("DIT/11/C1/0030");
		s1.setAddress("Kaluthara");

		s2.setName("Nimal");
		s2.setDit("DIT/11/C1/0040");
		s2.setAddress("Gampaha");
		
		System.out.println(s1.getName());
		System.out.println(s1.getDit());
		System.out.println(s1.getAddress());

		System.out.println(s2.getName());
		System.out.println(s2.getDit());
		System.out.println(s2.getAddress());
	}

}
