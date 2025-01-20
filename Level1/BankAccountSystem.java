/*Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details. */

import java.util.Scanner;
//Class BankAccount created
class BankAccount {
    //Static variable bankName and totalAccounts created
    public static String bankName="SBI";
    private static int totalAccounts=0;
    private static String accountHolderName;
    static int account=1000;
    private final int accountNumber;
    //Using this keyword to resolve ambiguity in the constructor
    BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = account + 1;
        totalAccounts++; account++;
    }

    //Static method getTotalAccounts created
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    //getAccountHolderName method created
    public String getAccountHolderName() {
        return accountHolderName;
    }

    //getAccountNumber method created
    public int getAccountNumber() {
        return accountNumber;
    }
    //setAccountHolderName method created
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    //display method created
    public void display(Object account) {
        if (account instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        }
        else {
            System.out.println("Invalid Account");
        }
        System.out.println();
    }
}
//class BankAccountSystem created
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        BankAccount account = new BankAccount(accountHolderName);

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        account.display(account);
        String accountHolderName1 = "John";
        BankAccount account1 = new BankAccount(accountHolderName1);
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        account1.display(account1);

        //changing account holder name
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        account.setAccountHolderName("Pratham Raj");
        account.display(account);
        
        String name ="Suraj Kumar Patel";
        account.display(name);
    }
}