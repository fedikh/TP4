
package com.mycompany.tp04.ex1;
public class BankAccount {
    protected int accountNumber;
    protected Double balance;

    public BankAccount(int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double montant) {
        this.balance += montant;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public Double getBalance() {
        return this.balance ;
    }
}
