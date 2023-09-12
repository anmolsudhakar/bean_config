package com.cgi.springbeans.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Professor {
    // Implement Professor class members and methods as needed
    private String name;
    private String designation;
    private String collegeName;
    private String department;
    private Course course;
     // methods
    public void displayProfessorInfo() {
        System.out.println("Professor name: " + name);
        System.out.println("Professor designation: " + designation);
        System.out.println("Professor collegeName: " + collegeName);
        System.out.println("Professor department: " + department);
        System.out.println("Professor course: " + course);
    }
}