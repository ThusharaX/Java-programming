
public class Bus extends AutoMobile {

	protected Bus(WorkShop workshop1, WorkShop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	public void manufacture() {
		
		System.out.println("Taxi is ");
		workshop1.work();
		workshop2.work();
	}
	
}
