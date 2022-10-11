package design.pattern.abstractFactory;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside the Circle:draw() method");
	}
}
