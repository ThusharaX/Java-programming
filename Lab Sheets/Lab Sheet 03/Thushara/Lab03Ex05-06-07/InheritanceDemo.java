
public class InheritanceDemo {

	public static void main(String[] args) {
		
		// Create Person object
		Person p = new Person("Thushara", "Gampaha");
		
		// Create Student object
		Student s = new Student("Thiwanka", "Colombo", "IT1020");
		
		// Create PartTimeStudent object
		PartTimeStudent pts = new PartTimeStudent("Thushara", "Kandy", "IT2040", 5);
		
		p.showDetails();
		s.showDetails();
		pts.showDetails();
	}

}
