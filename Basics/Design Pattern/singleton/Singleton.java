package design.pattern.singleton;

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() { }
	
	public static Singleton getInstance(){
		
		if(singleton == null){
			singleton = new Singleton();
			System.out.println("Singleton invocation");
		}
		return singleton;
	}
}
