package design.pattern.singleton;

public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			Singleton.getInstance();
		}
	}
}
