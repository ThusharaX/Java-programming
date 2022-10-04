package design.pattern.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton() {}
	
	public static ThreadSafeSingleton getInstance(){
		
		if(threadSafeSingleton == null){
			synchronized (ThreadSafeSingleton.class) {
				if(threadSafeSingleton == null){
					threadSafeSingleton = new ThreadSafeSingleton();
					System.out.println("Object created for ThreadSafeSingleton.");
				}
			}
		}
		return threadSafeSingleton;
	}
}

