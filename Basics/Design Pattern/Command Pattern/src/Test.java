
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Light livingRoomLight = new LivingRoomLight();
		Light kitchenLight = new KitchedLight();
		
		Command lightoncommand = new LightOnCommand(livingRoomLight);
		lightoncommand.execute();
		Command lightoffcommand = new LightOffCommand(livingRoomLight);
		lightoffcommand.execute();
		
		Command lightoncommand1 =  new LightOnCommand(kitchenLight);
		lightoncommand1.execute();
		
		Command lightoffcommand2 = new LightOffCommand(kitchenLight);
		lightoffcommand2.execute();
		
	}

}
