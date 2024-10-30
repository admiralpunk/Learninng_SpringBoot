package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(21);
		s.setMarks(73);
		s.setName("Aniket");

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> students = service.getStudents();
		System.out.println(students);
	}
}
