
package com.mycompany.tp04.ex1;

public class SavingsAccount extends BankAccount {
      private double interestRate ;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate ;
    }

    public double calculateInterest() {
        return super.balance * this.interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.balance >= amount) {
            super.balance -= amount;
            return true;
        } else {
            
            super.balance -= 10;
            return false;
        }
    }
}
