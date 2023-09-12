package com.cgi.springbeans;

import com.cgi.springbeans.model.Course;
import com.cgi.springbeans.model.Professor;
import com.cgi.springbeans.model.Student;
import com.cgi.springbeans.configuration.SpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbeansApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		// Retrieve the bean objects
		Student student1 = context.getBean("student1", Student.class);
		Student student2 = context.getBean("student2", Student.class);



		// Perform operations with the retrieved bean objects
		student1.displayStudentInfo();
		student2.displayStudentInfo();

	}

}
