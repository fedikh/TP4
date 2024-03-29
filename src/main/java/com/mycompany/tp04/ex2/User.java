
package com.mycompany.tp04.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter 
@AllArgsConstructor
public class User {
    private String firstname ;
    private String lastname ;
    private String email ;
    private Long  cin ;
    public void displayInfo(){
        System.out.println("firstname="+this.firstname+"lastname="+this.lastname+"email="+this.email+"cin="+this.cin );
         }
    public void updateProfile(String firstname, String lastname ,String email ,long cin){
    this.firstname= firstname ;   
    this.lastname=lastname ;
    this.email=email ;
    this.cin=cin;
    }
    public boolean authenticate(){
       
    return  true ;}
    
}
