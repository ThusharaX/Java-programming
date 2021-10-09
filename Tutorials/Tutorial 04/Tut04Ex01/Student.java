// Implement a class called Student with properties studentID, and name which uses the
// interfaces IDisplay and IInput

import java.util.Scanner;

public class Student implements IDisplay, IInput {
    Scanner input = new Scanner(System.in);
    private int studentID;
    private String name;

    // default constructor
    public Student() {
        this.studentID = 0;
        this.name = "";
    }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Student ID: " + studentID + " Name: " + name);
    }

    @Override
    public void printDetails() { // Print in multiple Lines
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
    }

    @Override
    public void input() {
        
        System.out.print("Enter Student ID: ");
        studentID = input.nextInt();

        System.out.print("Enter Student Name: ");
        name = input.next();

        
    }
}
