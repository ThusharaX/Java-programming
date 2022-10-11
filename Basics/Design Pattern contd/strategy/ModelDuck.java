
package design.pattern.stratergy;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am a model Duck");
	}
}
