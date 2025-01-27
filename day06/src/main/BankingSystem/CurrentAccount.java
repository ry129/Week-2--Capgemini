package main.BankingSystem;

// CurrentAccount Class
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(int accountNumber, String holderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts typically don't earn interest
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
