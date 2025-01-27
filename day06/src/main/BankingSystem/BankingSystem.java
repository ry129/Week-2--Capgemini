package main.BankingSystem;
import java.util.ArrayList;
import java.util.List;

// Main Class
 class BankingSystem {
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println("\nAccount Details:");
            account.display();

            System.out.println("Interest Earned: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Eligible for Loan: " + loanable.calculateloanEligibility());
            }
        }
    }

    public static void main(String[] args) {
        // Create accounts
        BankAccount savingsAccount = new SavingsAccount(123, "Alice", 10000, 3.5);
        BankAccount currentAccount = new CurrentAccount(456, "Bob", 2000, 10000);

        // Deposit and withdraw operations
        savingsAccount.deposit(2000);
        currentAccount.withdraw(500);

        // Add accounts to a list
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Process accounts
        processAccounts(accounts);
    }
}
