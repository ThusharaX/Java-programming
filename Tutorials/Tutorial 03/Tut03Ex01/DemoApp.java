
class Calculation {
	
	public static int addition(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int subtraction(int n1, int n2) {
		return n1 - n2;
	}
}

class DemoApp {
	
	public static void main(String[] args) {
		
		Calculation.addition(3, 2);
		Calculation.subtraction(5, 3);
	}
}

