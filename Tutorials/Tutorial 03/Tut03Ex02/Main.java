class Feet {
	private int feet;
	private int inches;
	
	public Feet(int feet, int inches){
		this.feet = feet;
		this.inches = inches;
	}
	
	// Copy the content of len to the new Feet Object.
	public Feet(Feet len) {
		this.feet = len.feet;
		this.inches = len.inches;
	}

	
	// Add f1+f2 feet and store in current feet
	public void add(Feet f1, Feet f2){
		int i = f1.inches + f2.inches;
		
		this.feet = (f1.feet + f2.feet) + (i / 12);
		this.inches = i % 12;
	}
	
	public void add(Feet f1) {
		int i = f1.inches + this.inches;

		this.feet += f1.feet + (i / 12);
		this.inches = i % 12;
	}
	
//	public static Feet add(Feet f1, Feet f2){}
//	can't add this because of duplicate
	
	public static Feet add(Feet f1, Feet f2, Feet f3) {
		int i = f1.inches + f2.inches + f3.inches;
		
		int feet = (f1.feet + f2.feet + f3.feet) + (i / 12);
		int inches = i % 12;
		
		return new Feet(feet, inches);
	}
	
	// Display a Length e.g 5’6”
	public void print() {
		System.out.println(feet + "'" + inches + '"');
	}
	
	public void print(String msg) {
		System.out.println(msg + feet + "'" + inches + '"');
	}
	
	public static void print(Feet f) {
		System.out.println(f.feet + "'" + f.inches + '"');
	}
}

class Main {

	public static void main(String[] args) {

		Feet f1 = new Feet(5, 6);
		Feet f2 = new Feet(6, 7);
		
		f1.print();
		f1.add(f1, f2);
		f1.print("Length : ");
		
		Feet f = new Feet(f2);
		f.print("Clone f2 = ");
		
		f1.add(f2);
		f1.print("Length : ");
		
		Feet.print(f);
		
		Feet f5 = Feet.add(f, f1, f2);
		Feet.print(f5);
	}

}
