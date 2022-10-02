import java.util.Scanner;

public class WrappingPaperArt {

	public static void main(String[] args) {
		Object lock = new Object();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pattern 1 = ");
		String pattern1 = sc.next();
		System.out.print("Enter Pattern 2 = ");		
		String pattern2 = sc.next();
		System.out.print("Enter count = ");
		int count = sc.nextInt();
		
		System.out.println("========Threads start printing patterns.=======");
		
		Thread patternThread1 = new Thread(new Pattern01(lock, pattern1, count));
		Thread patternThread2 = new Thread(new Pattern02(lock, pattern2, count));
		
		patternThread1.setName("Pattern 01 Thread");
		patternThread2.setName("Pattern 02 Thread");
		patternThread1.start();
		patternThread2.start();
	}
}

class Pattern01 implements Runnable{
	
	Object lock;
	String pattern;
	int count;
	
	public Pattern01(Object lock, String pattern, int count) {
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}

	@Override
	public void run() {
		synchronized (lock) {
			for (int x = 0; x < count; x++){
				try {
					lock.wait();
					for (int y = count; y >= x; y--) {
						System.out.print(" ");
					}
					for (int y = 0; y <= x; y++) {
						System.out.print("+ ");
					}
					System.out.println();
					Thread.sleep(1000);
					lock.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Pattern02 implements Runnable{
	
	Object lock;
	String pattern;
	int count;
	
	public Pattern02(Object lock, String pattern, int count) {
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}

	@Override
	public void run() {
		synchronized (lock) {
			for (int x = 0; x < count; x++){
				try {
					lock.notify();
					
					for (int y = count; y >= x; y--) {
						System.out.print(" ");
					}
					for (int y = 0; y <= x; y++) {
						System.out.print("- ");
					}
					System.out.println();
					Thread.sleep(1000);
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

