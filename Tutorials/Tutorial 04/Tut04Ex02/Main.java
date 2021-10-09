public class Main {
    public static void main(String[] args) {
        // Create objects from the FixedDeposit and SavingAccount. Call the Deposit() and withdraw() methods (Only SavingsAccount have withdrawals)

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(1, "John", 1000, 0.05);
        fixedDepositAccount.deposit(500);
        fixedDepositAccount.display();
        double interest = fixedDepositAccount.calculateInterest();
        System.out.println("Interest: " + interest);
        
        SavingAccount savingAccount = new SavingAccount(2, "Jane", 1000, 0.05);
        savingAccount.deposit(500);
        savingAccount.withdraw(100);
        savingAccount.display();
        interest = savingAccount.calculateInterest();
        System.out.println("Interest: " + interest);
    }
}
