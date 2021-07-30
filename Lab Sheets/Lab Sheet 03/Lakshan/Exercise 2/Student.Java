public class Student {
    private String name;
    private String ditno;
    private String address;

    //default constructor
    public Student() {
        this.name = null;
        this.ditno = null;
        this.address = null;
    }
    //constructor with parameters
    public Student(String name, String ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }
}