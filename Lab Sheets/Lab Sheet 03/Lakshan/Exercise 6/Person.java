public class Person {
    private String name;
    private String address;

    //default constructor
    public Person() {
        this.name = "";
        this.address = "";
    }
    //constructor with parameters
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //Mutator methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //Accessor methods
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    //showDetails method
    public void showDetail() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
