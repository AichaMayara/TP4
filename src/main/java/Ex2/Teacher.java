/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor
 
 
 
public class Teacher extends User{
    private Long hIndex;
    private List<Course> courses;
   
    
   public Teacher(String name,String Prenom,String email1,Long cin,Long h,List<Course> newcourses ) {
      super(name,Prenom,email1,cin);
      this.hIndex=h;
      this.courses=newcourses;
     }
    @Override
   public void displayInfo(){
      super.displayInfo();
      System.out.println(this.hIndex);
      for(Course c:courses){
      System.out.println(c.getName());}
      }
   public void updateProfile(String name,String Prenom,String email1,Long newHIndex, List<Course> newCourses) {
        super.updateProfile(name, Prenom, email1);
        this.hIndex = newHIndex;
        this.courses = newCourses;
        System.out.println("Profile updated successfully!");
    }
   public void displayCoursesContent(){
        for(Course c:courses){
           System.out.println(c.getContents());}
   }
    
    @Override
   public boolean authenticate() {
        return super.authenticate();}
       
}
