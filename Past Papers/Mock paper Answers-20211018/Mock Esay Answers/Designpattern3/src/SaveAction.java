
public class SaveAction implements Action{
	Receiver receiver;
	public SaveAction(Receiver receiver) {
		this.receiver = receiver;
	}
	public void Do() {
		receiver.PerformSave();
	}

}
