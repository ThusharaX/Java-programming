
public class IDE {
	Action action;
	public void SetAction(Action action) {
		this.action = action;
	}
	public void ExecuteAction() {
		action.Do();
	}
}

