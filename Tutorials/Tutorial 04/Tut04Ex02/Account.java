// Implement an abstract class called Account. Have the following properties accountNo,
// name, balance.

public abstract class Account {
    protected int accountNo;
    protected String name;
    protected double balance;

    // default constructor
    public Account() {
        this.accountNo = 0;
        this.name = "";
        this.balance = 0.0;
    }

    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Implement a Deposit() method to deposit money. The amount deposited should
    // update the balance.
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Have an abstract method called calculateInterest() which returns a double value
    public abstract double calculateInterest();

    // Implement a method to display() the account details.
    public void display() {
        System.out.println("Account No: " + this.accountNo);
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
    }
}