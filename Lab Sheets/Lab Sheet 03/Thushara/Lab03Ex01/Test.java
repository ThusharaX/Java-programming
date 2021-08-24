
public class Test {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Thushara";
		s1.ditno = "DIT/11/C1/0010";
		s1.address = "Colombo";
		
		s2.name = "Thiwanka";
		s2.ditno = "DIT/11/C1/0020";
		s2.address = "Kandy";
		
		System.out.println(s1.name);
		System.out.println(s1.ditno);
		System.out.println(s1.address);

		System.out.println(s2.name);
		System.out.println(s2.ditno);
		System.out.println(s2.address);
	}

}
