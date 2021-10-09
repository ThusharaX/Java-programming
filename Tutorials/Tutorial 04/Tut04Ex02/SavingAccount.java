// Implement a new class called SavingAccount which inherits the
// FixedDepositAccount class
// Implement a withdraw() method that allows you to withdraw money from the SavingsAccount.
// Implement the calculateInterest() method assuming that the Balance has been held for the one Month. Interest = balance * interestRate/100/12;

class SavingAccount extends FixedDepositAccount {

    // default constructor
    public SavingAccount() {
        super();
    }

    // parameterized constructor
    public SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, interestRate);
    }

    public void withdraw(double amount) {
        if (amount > super.getBalance()) {
            System.out.println("You can't withdraw more than your balance");
        } else {
            super.setBalance(super.getBalance() - amount);
        }
    }

    public double calculateInterest() {
        double interest = super.getBalance() * interestRate / 100 / 12;
        return interest;
    }
}
    