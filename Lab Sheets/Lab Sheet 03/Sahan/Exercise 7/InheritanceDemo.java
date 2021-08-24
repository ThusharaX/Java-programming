
public class InheritanceDemo { // Begining of the Class

	public static void main(String[] args) { // Begining of the Method
		
		Person p1 = new Person();
		p1.showDetails(); // Default Constructor Called
		System.out.println("");
		
		Student s1 = new Student("Sahan", "Colombo", "IT2011470"); 
		s1.showDetails();
		System.out.println("");
		
		PartTimeStudent pts = new PartTimeStudent("Kamal", "Kurunagala", "IT01117",6);
		pts.showDetails();

	} // End of the Method

} // End of the Class
