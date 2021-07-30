public class PartTimeStudent extends Student{
    private int noOfHours;

    //constructor
    public PartTimeStudent(String name, String address, String studentId, int noOfHours){
        super(name, address, studentId);
        this.noOfHours = noOfHours;
    }
    //mutator methods
    public void setNoOfHours(int noOfHours){
        this.noOfHours = noOfHours;
    }
    //accessor methods
    public int getNoOfHours(){
        return this.noOfHours;
    }
    //showDetail method
    public void showDetail(){
        System.out.println("Part-Time Student");
        super.showDetail();
        System.out.println("No. of Working Hours: " + this.noOfHours);
    }
}
