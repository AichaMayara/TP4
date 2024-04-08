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
public class SavingsAccount extends BankAccount {
    
    private Double interstRate;
    
    
    public SavingsAccount(int balance, Double interestRate){
        super(balance);
        this.interstRate=interestRate;
        
    }
    public void calculateInterset(){
      System.out.println(this.interstRate *super.balance);
    }
    public double getIntersetRate(){return this.interstRate;}
    @Override
    public void withdraw(double amount) {
         double penaltyRate = 0.05; // 5% penalty rate
         double penalty = 0.00;
         double withdrawalLimit = amount+1;
      if (amount > withdrawalLimit) {
            penalty = penaltyRate * amount;
            amount += penalty;
            System.out.println( penalty);
        }

        if (amount >super.balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }

    
}
