public class GettersAndSettersMain {
    public static void main(String args[]) {
        Recepitionist recep1 = new Recepitionist();
        
        recep1.setID(12);
        int id = recep1.getID();

        System.out.println(id);
    }
}
