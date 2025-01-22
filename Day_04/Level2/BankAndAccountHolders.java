package Day_04_Level_02;

import java.util.ArrayList;

class BankAccount {
        private double balance;
        private String accountNumber;

        public BankAccount(String accountNumber, double initialBalance) {
                this.accountNumber = accountNumber;
                this.balance = initialBalance;
        }

        public double getBalance() {
                return balance;
        }

        public String getAccountNumber() {
                return accountNumber;
        }


}

class Customer {
        private String name;
        private ArrayList<BankAccount> accounts;

        public Customer(String name) {
                this.name = name;
                this.accounts = new ArrayList<>();
        }

        public String getName() {
                return name;
        }

        public void openAccount(String accountNumber, double initialBalance) {
                BankAccount newAccount = new BankAccount(accountNumber, initialBalance);
                accounts.add(newAccount);
        }

        public void viewBalance() {
                for (BankAccount account : accounts) {
                        System.out.println("Account Number: " + account.getAccountNumber() + " Balance: " + account.getBalance());
                }
        }

        public ArrayList<BankAccount> getAccounts() {
                return accounts;
        }
}

class Bank {
        private String bankName;
        private ArrayList<Customer> customers;

        public Bank(String bankName) {
                this.bankName = bankName;
                this.customers = new ArrayList<>();
        }

        public void addCustomer(Customer customer) {
                customers.add(customer);
        }

        public void openAccount(Customer customer, String accountNumber, double initialBalance) {
                customer.openAccount(accountNumber, initialBalance);
        }

        public void displayCustomers() {
                System.out.println("Customers in " + bankName + " Bank:");
                for (Customer customer : customers) {
                        System.out.println("Customer: " + customer.getName());
                }
        }
}

public class BankAndAccountHolders {
        public static void main(String[] args) {
                // Create a bank
                Bank bank = new Bank("SBI Bank");

                // Create customers
                Customer customer1 = new Customer("Rahul");
                Customer customer2 = new Customer("Suraj");

                // Add customers to the bank
                bank.addCustomer(customer1);
                bank.addCustomer(customer2);

                // Open accounts for customers
                bank.openAccount(customer1, "A123", 1000.0);
                bank.openAccount(customer1, "A124", 500.0);
                bank.openAccount(customer2, "B123", 1500.0);

                // View balances for each customer
                System.out.println("Customer 1 account balances:");
                customer1.viewBalance();
                System.out.println();

                System.out.println("Customer 2 account balances:");
                customer2.viewBalance();



                // Display all customers
                bank.displayCustomers();
        }
}
