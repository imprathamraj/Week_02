/*4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/
package com.encapsulation;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract void calculateInterest();

    //method to display details
    public void displayDetails() {
        System.out.println("----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    //setter method
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //getter method
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
}
interface Loanable{
    void applyForLoan();
    void calculateLoanEligibility();
}
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.0;

    @Override
    public void calculateInterest() {
        System.out.println("Interest: " + (getBalance() * (INTEREST_RATE / 100)));
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application not available for Current Accounts.");
    }

    @Override
    public void calculateLoanEligibility() {
        System.out.println("Current Accounts are not eligible for loans.");
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    // Constructor
    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application for Savings Account is submitted.");
    }

    @Override
    public void calculateLoanEligibility() {
        if (getBalance() > 100000) {
            System.out.println("Savings Account is eligible for a loan.");
        } else {
            System.out.println("Savings Account is not eligible for a loan.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Calculated Interest: " + interest);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Created a SavingsAccount instance
        BankAccount savingsAccount = new SavingsAccount(5.0); // 5% interest rate
        savingsAccount.setAccountNumber(111);
        savingsAccount.setHolderName("Pratham Raj");
        savingsAccount.setBalance(120000);

        // Performed operations on SavingsAccount
        System.out.println("------ Savings Account ------");
        savingsAccount.deposit(10000); 
        savingsAccount.withdraw(20000);
        savingsAccount.displayDetails();

        // Accessed specific methods of SavingsAccount
        SavingsAccount specificSavingsAccount = (SavingsAccount) savingsAccount;
        specificSavingsAccount.calculateLoanEligibility();
        specificSavingsAccount.applyForLoan();
        savingsAccount.calculateInterest(); 

        // Created a CurrentAccount instance
        BankAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNumber(222);
        currentAccount.setHolderName("Ravi Kumar");
        currentAccount.setBalance(50000);

        // Performed operations on CurrentAccount
        System.out.println("\n------ Current Account ------");
        currentAccount.deposit(5000);
        currentAccount.withdraw(15000); 
        currentAccount.displayDetails();

        // Accessed specific methods of CurrentAccount
        CurrentAccount specificCurrentAccount = (CurrentAccount) currentAccount;
        specificCurrentAccount.calculateLoanEligibility();
        specificCurrentAccount.applyForLoan();
        currentAccount.calculateInterest(); 
    }
}