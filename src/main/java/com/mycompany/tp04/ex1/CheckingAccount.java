
package com.mycompany.tp04.ex1;

public class CheckingAccount extends BankAccount {
    private double overdraftAllowed;

    public CheckingAccount(int accountNumber, double balance, double overdraftAllowed) {
        super(accountNumber, balance);
        this.overdraftAllowed = overdraftAllowed;
    }

    public double getOverdraftAllowed() {
        return this.overdraftAllowed ;
    }

    public void setOverdraftAllowed(Double overdraftAllowed) {
        this.overdraftAllowed = overdraftAllowed  ;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftAllowed >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    
}
