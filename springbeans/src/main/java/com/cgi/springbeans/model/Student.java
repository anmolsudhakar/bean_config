package com.cgi.springbeans.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    // Implement Student class members and methods as needed
    private String name;
    private int rollNo;
    private String standard;

    private Course course;
    private Professor professor;

    //methods
    public void displayStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student rollNo: " + rollNo);
        System.out.println("Student standard: " + standard);
        System.out.println("Student course: " + course);
        System.out.println("Student professor: " + professor);
    }







}