/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor

public class User {
    private String firstName;
    private String lastName ;
    private String email;
    private Long cin;
    
    
  public void displayInfo(){
   System.out.println("Nom="+ this.firstName +"Prenom="+this.lastName+"d'email="+this.email+"et de cin="+this.cin);
 }
  public void updateProfile(String name,String Prenom,String email1 ){
  this.firstName=name;
  this.lastName=Prenom;
  this.email=email1;
  
   }

    
    public boolean authenticate() {
    return this.email.equals(email) && this.cin.equals(cin);
}  
}
