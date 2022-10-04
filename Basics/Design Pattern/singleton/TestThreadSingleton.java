package design.pattern.singleton;

public class TestThreadSingleton implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread(new TestThreadSingleton()).start();
		
		for (int i = 0; i < 10; i++) {
			Singleton.getInstance();
			ThreadSafeSingleton.getInstance();
		}
	}
	
	/**
	 * Invoke thread 
	 */
	public void run(){
		for (int i = 0; i < 10; i++) {
			Singleton.getInstance();
			ThreadSafeSingleton.getInstance();
		}
	}
}

