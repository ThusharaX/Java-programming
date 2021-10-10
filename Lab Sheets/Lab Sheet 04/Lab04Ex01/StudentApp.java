public class StudentApp {
    public static void main(String[] args) {
        
        Student[] students = new Student[5];

        
        students[0] = new Student("John", "Bachelor", "1234567890");
        students[1] = new Student("Jane", "Master", "0987654321");
        students[2] = new Student("Jack", "PhD", "0123456789");

        students[3] = new Student();
        students[3].setName("Mary");
        students[3].setDegree("Bachelor");
        students[3].setMobile("9876543210");

        students[4] = new Student();
        students[4].setName("Tom");
        students[4].setDegree("Master");
        students[4].setMobile("0123456789");


        
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }

        System.out.println(Student.getNextStudentID());
    }
}