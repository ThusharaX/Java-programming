public class Recepitionist {
    private int staffID;
    private String name;
    private String telephoneNumber;

    // Setter
    public void setID(int ID) {
        this.staffID = ID;
    }

    // Getter
    public int getID() {
        return this.staffID;
    }

    public Boolean checkRoomAvailability(int roomNumber){
        return true;
    }
    public double generateBill(){
        return 0;
    }
    public void takeCustomerFeddback() { }
}
