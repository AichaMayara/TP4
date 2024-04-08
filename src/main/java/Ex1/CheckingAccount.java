/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;
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
public class CheckingAccount extends BankAccount{
    private double overdraftAllowed;
    
    public CheckingAccount(int balance,double overdraftAllowed){
        super(balance);
        this.overdraftAllowed=overdraftAllowed;
    }
    public void setOverdraftAllowed(double overdraftAllowed){this.overdraftAllowed=overdraftAllowed;}
    public double getOverdraftAllowed(){return this.overdraftAllowed;}
    @Override
     public void withdraw(double montant) {
        if (montant<=super.balance+this.overdraftAllowed) {
            this.balance -= montant;
            System.out.println("Retrait de " + montant + " effectué.");}
        else {
            System.out.println("Découvert non autorisé. Solde insuffisant.");
        }
    }
}
