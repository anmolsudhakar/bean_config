package com.cgi.springbeans.configuration;

import com.cgi.springbeans.model.Course;
import com.cgi.springbeans.model.Professor;
import com.cgi.springbeans.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cgi.springbeans")
public class SpringConfiguration {




    @Bean
    public Student student1() {
        Student student = new Student();
        student.setName("Anmol Sudhakar");
        student.setRollNo(72);
        student.setStandard("2nd Year");
        student.setCourse(
                new Course("Maths", "M101", "Btech Maths course")
        );
        student.setProfessor(
                new Professor("Dr. Smith", "Professor", "NIT Sikkim", "Maths")
        );
        return student;
    }

    @Bean
    public Student student2() {
        Student student = new Student();
        student.setName("Lakshay Singh");
        student.setRollNo(79);
        student.setStandard("2nd year");
        student.setCourse(
                new Course("Maths", "M101", "Btech Maths course")
        );
        student.setProfessor(
                new Professor("Dr. Smith", "Professor", "NIT Sikkim", "Maths")
        );
        return student;
    }

}

