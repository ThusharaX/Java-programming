public class Test {
    public static void main(String[] args) {
        // Create Students Objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Assign values to the objects
        s1.name = "Pasindu";
        s1.ditno = "IT20123456";
        s1.address = "Galle";

        s2.name = "Lakshan";
        s2.ditno = "IT20123457";
        s2.address = "Matara";

        // Display the values
        System.out.println("Student 1");
        System.out.println("Name: " + s1.name + "\nDitno: " + s1.ditno + "\nAddress: " + s1.address + "\n");
        System.out.println("Student 2");
        System.out.println("Name: " + s2.name + "\nDitno: " + s2.ditno + "\nAddress: " + s2.address);
    }
}