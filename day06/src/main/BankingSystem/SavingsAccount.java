package main.BankingSystem;

 class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Annual interest rate

    // Constructor
    public SavingsAccount(int accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100); // Interest = balance * rate / 100
    }

    @Override
    public void applyforLoan(double loanAmount) {
        System.out.println("Loan application submitted for amount: " + loanAmount);
    }

    @Override
    public boolean calculateloanEligibility() {
        return getBalance() >= 5000; // Eligible if balance is at least 5000
    }
}


