package design.pattern.stratergy;

public class ModelQuack implements IQuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Quack Model duck");
	}
}
