public class BankAccountManagement {

    // Parent class: BankAccount
    public static class BankAccount {
        // Instance variables
        public String accountNumber;   // Public access: Can be accessed anywhere
        protected String accountHolder; // Protected access: Accessible within the same package and subclasses
        private double balance; // Private access: Can only be accessed within this class

        // Constructor to initialize account details
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // Public method to access balance
        public double getBalance() {
            return balance;
        }

        // Public method to modify balance
        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            } else {
                System.out.println("Invalid balance value.");
            }
        }

        // Method to display account details
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: $" + balance);
        }
    }

    // Subclass: SavingsAccount
    public static class SavingsAccount extends BankAccount {

        // Constructor for SavingsAccount
        public SavingsAccount(String accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);  // Call the parent class constructor
        }

        // Method to display details of a SavingsAccount
        public void displaySavingsAccountDetails() {
            // Accessing protected member 'accountHolder' and public member 'accountNumber' from the parent class
            System.out.println("Savings Account Details:");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);  // Protected variable is accessible here
            System.out.println("Balance: $" + getBalance());  // Accessing private balance using getter
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account1 = new BankAccount("12345", "Alice", 5000.0);
        account1.displayAccountDetails();

        // Modify the balance using setter method
        account1.setBalance(5500.0);
        System.out.println("\nAfter modifying balance:");
        account1.displayAccountDetails();

        // Create an instance of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("67890", "Bob", 10000.0);
        savingsAccount.displaySavingsAccountDetails();
    }
}
