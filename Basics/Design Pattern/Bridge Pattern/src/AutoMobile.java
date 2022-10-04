
public abstract class AutoMobile {

	protected WorkShop workshop1;
	protected WorkShop workshop2;
	
	protected AutoMobile (WorkShop workshop1, WorkShop workshop2 ) {
		
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
		
	}
	
	abstract public void manufacture();
	
	
}
