/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor


public class StaffMember extends User {
    private String qualification;
    private Integer experience ;
    private List<String> tasks;
    
    
    public StaffMember(String name,String Prenom,String email1,Long cin,String qualification,Integer experience,List<String> newtasks){
        super(name,Prenom,email1,cin);
        this.qualification=qualification;
        this.experience=experience;
        this.tasks=newtasks;
    
    }
    @Override
    public void displayInfo(){
         super.displayInfo();
         System.out.println("qualification="+this.qualification+"l'experience"+this.experience);
         for(String s:tasks){System.out.println(s);}
   }
   public void updateProfile( String name,String Prenom,String email1,String qualification,Integer experience,List<String> newTasks){
       super.updateProfile(name, Prenom, email1);
       this.qualification=qualification;
       this.experience=experience;
       this.tasks=newTasks;}
   public void  finishTask(String task1){
       tasks.remove(task1);
       System.out.println("Task finished!");}    
   
    @Override
  public boolean authenticate() {
   return super.authenticate();}
      
    
}
