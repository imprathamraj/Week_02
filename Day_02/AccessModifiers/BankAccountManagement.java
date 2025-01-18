/*
Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.*/
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    // Method to display details of the savings account
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = "123456789";
        bankAccount.accountHolder = "Alice";
        bankAccount.setBalance(1000.0);
        System.out.println("Account Number: " + bankAccount.accountNumber);
        System.out.println("Account Holder: " + bankAccount.accountHolder);
        System.out.println("Balance: " + bankAccount.getBalance());

        // Creating an object of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountNumber = "987654321";
        savingsAccount.accountHolder = "Bob";
        savingsAccount.displayDetails();
    }
}
