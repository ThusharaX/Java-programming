// Implement a class called Book with properties bookID, title, publisher which uses
// the interfaces IDisplay and IInput

import java.util.Scanner;

public class Book implements IDisplay, IInput {
    Scanner input = new Scanner(System.in);
    private int bookID;
    private String title;
    private String publisher;

    // default constructor
    public Book() {
        this.bookID = 0;
        this.title = "";
        this.publisher = "";
    }

    public Book(int bookID, String title, String publisher) {
        this.bookID = bookID;
        this.title = title;
        this.publisher = publisher;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getPublisher() {
        return publisher;
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void print() { // Print in one line
        System.out.println("Book ID: " + bookID + " Title: " + title + " Publisher: " + publisher);
    }

    @Override
    public void printDetails() { // Print in multiple Lines
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
    }

    @Override
    public void input() {
        
        System.out.println("Enter Book ID: ");
        bookID = input.nextInt();

        System.out.println("Enter Title: ");
        title = input.next();

        System.out.println("Enter Publisher: ");
        publisher = input.next();

    }
}

