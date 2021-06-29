public class ConstructorsMain {
    public static void main(String args[]) {
        Recepitionist recep1= new Recepitionist();
        boolean status = recep1.checkRoomAvailability(3);
        double bill = recep1.generateBill();
        recep1.takeCustomerFeddback();
    }
}
