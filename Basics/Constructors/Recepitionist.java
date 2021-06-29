public class Recepitionist {
    private int staffID;
    private String name;
    private String telephoneNumber;

    // Default Constructor
    public Recepitionist() {
        this.staffID = 0;
        this.name = "abc";
        this. telephoneNumber = null;
    }

    // Overloaded Constructor
    public Recepitionist(int pID, String pName, String pTelephoneNumber) {
        this.staffID = pID;
        this.name = pName;
        this.telephoneNumber = pTelephoneNumber;
    }

    public Boolean checkRoomAvailability(int roomNumber){
        return true;
    }
    public double generateBill(){
        return 0;
    }
    public void takeCustomerFeddback() { }
}
