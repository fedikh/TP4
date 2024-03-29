
package com.mycompany.tp04.ex2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@AllArgsConstructor 
 
public class Student extends User{
    private double average ;
    private Classe clas ;
    private Status status ; 

    public Student(String firstname, String lastname, String email, Long cin,double average, Classe clas, Status status) {
        super(firstname, lastname, email, cin);
        this.average = average;
        this.clas = clas;
        this.status = status;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo() ;
        System.out.println("average="+this.average+"classe="+this.clas+"Status="+this.status);    
          }
    public void updateProfile(double average ,Classe clas ,Status status ,String firstname, String lastname ,String email ,long cin){
        super.updateProfile(firstname,lastname ,email ,cin) ;
        this.average=average ;
        this.clas=clas ;
        this.status=status ;}
    
    
    
    
    
    
    
}
