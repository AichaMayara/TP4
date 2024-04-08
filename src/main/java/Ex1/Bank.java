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
public class Bank {
    private ArrayList<Customer> clients;
    
    
   public void addCustomer(Customer client){
   clients.add(client);} 
   
   public void  removeCustomer(Customer client){
   clients.remove(client);}
   public double getTotalBalance(){
     for(Customer C:clients){
         return C.getTotalAccountBalance();
     }  return 0.0;
}}
        
    
   

