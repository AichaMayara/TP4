/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor


/**
 *
 * @author user
 */
public class Customer {
    
    private String firstName;
    private String  lastName;
    private  ArrayList<BankAccount> accounts;
    
    
    public Customer(String firstName,String lastName){
    this.firstName=firstName;
    this.lastName=lastName;}
    public void addAccount(BankAccount compte){accounts.add(compte);}
    public void removeAccount(BankAccount compte){accounts.remove(compte);}
    public Double getTotalAccountBalance(){
       Double totalBalance= 0.00;
        for(BankAccount B :accounts){return totalBalance+= B.getBalance();}
        return totalBalance;
    }
    
        
    
    public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        if (sourceAccount.getBalance() >= amount) {
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed");
        }
    }
    
    
    
}
