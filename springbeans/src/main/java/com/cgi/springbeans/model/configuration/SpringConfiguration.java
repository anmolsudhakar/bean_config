package com.cgi.springbeans.model.configuration;

import com.cgi.springbeans.model.Course;
import com.cgi.springbeans.model.Professor;
import com.cgi.springbeans.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public Professor professor() {
        return new Professor();
    }

    @Bean
    public Course course() {
        return new Course();
    }

    // Define relationships between beans if required
    @Bean
    public Student student1() {
        Student student = new Student();
        student.setName("John");
        student.setRollNo(1);
        student.setStandard("10th");
        student.setCourse(
                new Course("Maths", "M101", "Btech Maths course")
        );
        student.setProfessor(
                new Professor("Dr. Smith", "Professor", "NIT Sikkim", "Maths", student.getCourse())
        );
        return student;
    }

}

