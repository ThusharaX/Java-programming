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
    //showDetails method
    public void showDetail() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
