package design.pattern.stratergy;

public class TestDuck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Start Mollard Duck");
		System.out.println("==================");
		Duck mollard = new MollardDuck();
		mollard.performFly();
		mollard.performQuack();
		
		System.out.println("Start Model Duck");
		System.out.println("==================");
		Duck model = new ModelDuck();
		
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPower());
		model.performFly();
		
		model.performQuack();
		model.setQuackBehaviour(new ModelQuack());
		model.performQuack();
	}
}
