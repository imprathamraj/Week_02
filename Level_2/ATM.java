/*
Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to
 modify and view the account's state.*/
import java.util.Scanner;
 class BankAccount{
    String accountHolder; 
    String accountNumber; 
    double balance;

    //constructer to store details of account holder 
    BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder; 
        this.accountNumber = accountNumber;
        this.balance = balance;
    } 

    //check total balance in account
   void fetchBalance(){
        System.out.println("Available Balance is:  "+balance);
       // return balance;
    } 
    //method to withdraw amount
    void withDrawAmount(double amount){
        if(amount<= balance){
            System.out.println("Amount "+ amount +" withdraw sucessfull ");
            balance-=amount;
            fetchBalance();
        } 
        else{
            System.out.println("Insufficient Balance");
        }
    }


    //display Details  
    void display(){
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

 } 

public class ATM { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //object
        BankAccount account = new BankAccount("Pratham Raj", "99999999", 200000); 
        //Display the account details
        account.display();
        //Display the total account balance
        account.fetchBalance();
        System.out.print("Enter amount you want to withdraw: ");
        double amount = sc.nextDouble(); 
        //Fetching the amount from account
        account.withDrawAmount(amount);
  
    }

}