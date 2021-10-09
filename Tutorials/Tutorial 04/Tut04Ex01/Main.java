// Create objects of the Book and Student in the main method

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming", "John Wiley & Sons");
        Book book2 = new Book(2, "C Programming", "Pearson");
        Book book3 = new Book(3, "C++ Programming", "Pearson");

        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Mary");
        Student student3 = new Student(3, "Peter");

        // Create a variable of the IDisplay and IInput interfaces and call the
        // printDetails() and input() methods respectively of Book and Student objects
        
        // For Book
        IDisplay displayBook = book1;
        displayBook.printDetails();
        IInput inputBook = book1;
        inputBook.input();

        // For Student
        IDisplay displayStudent = student1;
        displayStudent.printDetails();
        IInput inputStudent = student1;
        inputStudent.input();
        
    }
}