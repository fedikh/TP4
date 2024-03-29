
package com.mycompany.tp04.ex1;
import java.util.ArrayList;
public class Customer {
  private String firstName ;
  private String lastName ;
  private ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void removeAccount(BankAccount account) {
        accounts.remove(account);
    }

    public double getTotalAccountBalance() {
        double totalBalance = 0;
        for (BankAccount account : this.accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance ;
    }

    public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        if (sourceAccount.withdraw(amount)) {
            destinationAccount.deposit(amount);
        } else {
            System.out.println("impossible : amount >>>> balance source compte");
        }
    }
    
    
    
    
    
    
}
