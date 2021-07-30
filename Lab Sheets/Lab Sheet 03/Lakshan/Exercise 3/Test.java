public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Pasindu","IT20123456","Galle");

        s1.setName("Lakshan");
        s1.setDitno("IT20657567");
        s1.setAddress("Colombo");
        System.out.println("Name: " + s1.getName()+ "\nDitno: " + s1.getDitno() + "\nAddress: " + s1.getAddress());
    }
}