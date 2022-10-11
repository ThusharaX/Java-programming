package design.pattern.decorator;

public class TestPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee = new Engineer();
		employee = new EmployeeCertification(employee);
		employee = new WorkExperience(employee);

		System.out.println(employee.description + " " + employee.getSalary());

		Employee employee2 = new Consultant();
		employee2 = new WorkExperience(new EmployeeCertification(employee2));

		System.out.println(employee2.description + " " + employee2.getSalary());

		System.out.println("PM salary = "
				+ new WorkExperience(new EmployeeCertification(new Manager()))
						.getSalary());

	}

}
