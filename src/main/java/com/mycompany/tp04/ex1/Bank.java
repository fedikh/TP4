
package com.mycompany.tp04.ex1;
import java.util.ArrayList ;
public class Bank {
   private ArrayList<Customer> clients ;
  
   public Bank() {
        this.clients = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        this.clients.add(customer);
    }

    public void removeCustomer(Customer customer) {
        this.clients.remove(customer);
    }

    public double getTotalBalance() {
        Double totalBalance = 0.0;
        for (Customer customer : this.clients) {
            totalBalance += customer.getTotalAccountBalance();
        }
        return totalBalance;
    }
   
   
   
   
   
   
   
   
   
   
   
   
}
