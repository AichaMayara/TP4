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
public class BankAccount {
    
    protected Integer accountNumber;
    protected Double balance;
    
    
    public void  deposit(double montant){ 
        if( montant>0){
          this.balance= this.balance+ montant;
          System.out.println("NewBalance="+this.balance);}
        else{System.out.println("error!!, saisir un autre montant");}
        }
    public void  withdraw(double montant){
        if(this.balance>= montant){
           this.balance=this.balance-montant;
           System.out.println("NewBalance="+ this.balance);}
           
        else{ System.out.println("error");}  }

    public Double getBalance(){return this.balance;}
    
}
