
package com.mycompany.tp04.ex2;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter 
@AllArgsConstructor
public class StaffMember extends User {
    private String qualification ;
    private int experience ;
    private List<String> tasks;

    public StaffMember( String firstname, String lastname, String email, Long cin , String qualification, int experience, List<String> tasks) {
        super(firstname, lastname, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo() ;
        System.out.println("qualificatin="+this.qualification+"experience="+this.experience+"tasks="+this.tasks);    
          }
    public void updateProfile(String qua,int exp ,List<String> tasks){
        super.updateProfile(super.getFirstname(), super.getLastname() , super.getEmail() ,super.getCin() ) ;
        this.experience=exp ;
        this.qualification=qua ;
        this.tasks=tasks ; }
    public void finishTask(String task){
    this.tasks.remove(task) ;
    
    }    
             
}
