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
 
public class Student extends User {
    private Double average;
    private Classe classe;
    private Status status;
    
    
    public Student(String name,String Prenom,String email1,Long cin ,Double average,Classe classe,Status status){
    super(name,Prenom,email1,cin);
    this.average=average;
    this.classe=classe;
    this.status=status;}
    @Override
    public void displayInfo(){
         super.displayInfo();
         System.out.println("moyenne="+this.average+"class"+this.classe+"status"+this.status);
      
   }
   public void updateProfile( String name,String Prenom,String email1,Double average1,Classe class1,Status status1){
       super.updateProfile(name, Prenom, email1);
       this.average=average1;
       this.classe=class1;
       this.status=status1;}
       

 
    @Override
  public boolean authenticate() {
   return super.authenticate();}
      
    
}
