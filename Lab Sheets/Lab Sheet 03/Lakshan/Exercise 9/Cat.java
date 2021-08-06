public class Cat extends Pet{ 
    private int livesLeft; 
    public Cat(String n, String o, int a,  int l) { 
        super(n, o, a); 
        this.livesLeft = l; 
    } 
    public Cat(String n, String o) {
        super(n, o);
        this.livesLeft = 7;
    }
}//end of the pet class 