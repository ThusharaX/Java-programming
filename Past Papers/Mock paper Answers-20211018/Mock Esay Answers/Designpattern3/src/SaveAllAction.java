
public class SaveAllAction implements Action{
	Receiver receiver;
	public SaveAllAction(Receiver receiver) {
		this.receiver = receiver;
	}
	public void Do() {
		receiver.PerformSaveAll();
	}
}
