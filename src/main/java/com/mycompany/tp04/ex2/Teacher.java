
package com.mycompany.tp04.ex2;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter 
@AllArgsConstructor
public class Teacher extends User {
    private long hIndex ;
    private List<Course> courses ;

    public Teacher(String firstname, String lastname, String email, Long cin ,long hIndex, List<Course> courses) {
        super(firstname, lastname, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }
       
    
    public void displayCoursesContent(){
         for (Course c: this.courses){
         System.out.println(c);}
    
    }
    
    
}
