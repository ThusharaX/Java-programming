package design.pattern.decorator;

public class WorkExperience extends EmployeeQualification {
	
	Employee employee;
	
	public WorkExperience(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		return "Add Work experience.";
	}

	@Override
	public double getSalary() {
		return 20000 + employee.getSalary();
	}
}
