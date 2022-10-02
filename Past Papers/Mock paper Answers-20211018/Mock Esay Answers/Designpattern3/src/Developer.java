
public class Developer {
	public static void main(String args[]) {
		IDE ide=new IDE();
		Receiver intendedreceiver = new Receiver();
		System.out.println("Pressed save button!");
		SaveAction saveaction = new SaveAction(intendedreceiver);
		ide.SetAction(saveaction);
		ide.ExecuteAction();
		
		System.out.println("Pressed saveAll button!");
		SaveAllAction saveallaction = new SaveAllAction(intendedreceiver);
		ide.SetAction(saveallaction);
		ide.ExecuteAction();
	}

}
