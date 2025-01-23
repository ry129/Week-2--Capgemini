import java.util.ArrayList;
import java.util.List;

// Customer Class
class Customer {
    String name;
    List<String> accounts; // List of account numbers

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account
    public void addAccount(String accountNumber) {
        accounts.add(accountNumber);
    }

    // View balances
    public void viewBalance() {
        System.out.println("Accounts for " + name + ":");
        for (String account : accounts) {
            System.out.println("Account Number: " + account);
        }
    }
}

// Bank Class
class Bank {
    String name;
    List<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Open an account
    public void openAccount(Customer customer, String accountNumber) {
        customer.addAccount(accountNumber);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account " + accountNumber + " opened for " + customer.name);
    }

    // Display customers
    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer.name);
        }
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("National Bank");

        // Create customers
        Customer customer1 = new Customer("Aman");
        Customer customer2 = new Customer("mohoan");

        // Open accounts
        bank.openAccount(customer1, "ACC123");
        bank.openAccount(customer2, "ACC456");
        bank.openAccount(customer1, "ACC789");

        // Display customers
        bank.displayCustomers();

        // View account details
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
