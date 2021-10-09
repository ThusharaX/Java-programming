// Implement a new class called FixedDepositAccount which extends the Account class
// It should have a new property called interestRate and Interest.
// Write a setter and getter for the interestRate.
// Implement the calculateInterest() method assuming that the Balance has been
// held for the entire year. interest = balance * interestRate/100;

public class FixedDepositAccount extends Account {
    protected double interestRate;
    protected double interest;

    // default constructor
    public FixedDepositAccount() {
        super();
        interestRate = 0.0;
        interest = 0.0;
    }

    // parameterized constructor
    public FixedDepositAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateInterest() {
        interest = super.getBalance() * interestRate / 100;
        return interest;
    }
}