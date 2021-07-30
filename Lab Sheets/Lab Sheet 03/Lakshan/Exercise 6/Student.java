public class Student extends Person {
    private String studentId;
    //constructor
    public Student(String name, String adress, String studentId) {
        super(name, adress);
        this.studentId = studentId;
    }
    //Mutator methods
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    //Accessor methods
    public String getStudentId() {
        return studentId;
    }
    //showDetail method
    public void showDetail() {
        System.out.println("Student Details");
        super.showDetail();
        System.out.println("Student ID: " + studentId);
    }
}