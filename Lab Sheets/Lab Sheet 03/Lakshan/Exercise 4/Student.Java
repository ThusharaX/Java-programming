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

    //Mutator methods
    public void setName(String name) {
        this.name = name;
    }
    public void setDitno(String ditno) {
        this.ditno = ditno;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    //Accessor methods
    public String getName() {
        return this.name;
    }
    public String getDitno() {
        return this.ditno;
    }
    public String getAddress() {
        return this.address;
    }
    public String getDetails() {
        return "I am a Student.\nMy name is " + this.name + "\nI am from " + this.address + "\nMy dit no is " + this.ditno;
    }
}