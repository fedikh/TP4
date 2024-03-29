
package com.mycompany.tp04.ex2;
import java.util.ArrayList ;
import java.util.List ;

public class Main {
 public static void main(String[] args) {
        Student student = new Student("student1", "student1", "student@email.com", 12345L, 15.0, Classe.IA1_2, Status.NONREDOUBLANT);
        student.displayInfo();
        student.updateProfile(11.2 ,Classe.IA1_2 ,Status.NONREDOUBLANT ,"fedi", "khala","fedi@email.com" ,13564987);
        student.displayInfo();
        boolean isAuthenticatedStudent = student.authenticate();
        System.out.println("Student Authentication: " + isAuthenticatedStudent);
        Course mathCourse = new Course("Math", new ArrayList<>(List.of("Algebra", "Calculus")), 2.0f);
        Course physicsCourse = new Course("Physics", new ArrayList<>(List.of("Mechanics", "Thermodynamics")), 1.5f);
        Teacher teacher = new Teacher("teacher1", "teacher1", "teacher1@email.com", 67890L, 12L, new ArrayList<>(List.of(mathCourse, physicsCourse)));
        teacher.setHIndex(10L);
        teacher.displayInfo();
        teacher.displayCoursesContent();
        StaffMember staffMember = new StaffMember("member1", "member1", "member1@email.com", 11111L, "Engineer", 5, new ArrayList<>(List.of("Task1", "Task2", "Task3")));
        staffMember.displayInfo();
        staffMember.finishTask("Task2");
        staffMember.displayInfo();
    }
    
}
