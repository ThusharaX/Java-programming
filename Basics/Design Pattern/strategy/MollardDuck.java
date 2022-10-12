package design.pattern.stratergy;

public class MollardDuck extends Duck{
	
	public MollardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mollard Duck.");
	}
}
