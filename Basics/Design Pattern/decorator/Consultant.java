package design.pattern.decorator;

public class Consultant extends Employee {
	
	public Consultant() {
		description = "Consultant";
	}

	@Override
	public double getSalary() {
		return 70000;
	}

}
