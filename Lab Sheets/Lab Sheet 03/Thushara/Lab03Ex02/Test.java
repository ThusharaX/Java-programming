
public class Test {

	public static void main(String[] args) {

		Student s1 = new Student("Thushara", "DIT/11/C1/0010", "Colombo");
		Student s2 = new Student("Thiwanka", "DIT/11/C1/0020", "Kandy");
		
		System.out.println(s1.name);
		System.out.println(s1.ditno);
		System.out.println(s1.address);

		System.out.println(s2.name);
		System.out.println(s2.ditno);
		System.out.println(s2.address);
	}

}
