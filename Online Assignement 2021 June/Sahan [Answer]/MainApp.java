import java.util.Scanner; // Import java Scanner
import java.util.Random; // Import Random

public class MainApp { // Begining of the Main class 

	public static void main(String[] args)throws SoundException    { // Begining of the method and throws Sound Exception
		
		Scanner sc = new Scanner(System.in); // Scanner
		Hunter myhunter = new Hunter("Maha Deva", "Brown"); 
		Soldier threeSoldiers[] = {new RedSoldier(), new RedSoldier(), new GreenSoldier()};
    	Board myboard = new Board("superDot", myhunter, threeSoldiers);
		
	
		System.out.println("Use the keyboard up, down, left, right arrow keys to move the hunter");

		myhunter.setxPos(sc.nextInt());
		myhunter.setyPos(sc.nextInt());
		myhunter.move(myhunter);
	        myhunter.hunt(myboard, "superDot");
		threeSoldiers[2].hunt();
		
	} // End the of the Method

} // End of the Main Class