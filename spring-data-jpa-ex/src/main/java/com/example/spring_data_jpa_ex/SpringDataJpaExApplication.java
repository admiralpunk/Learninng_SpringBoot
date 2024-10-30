package com.example.spring_data_jpa_ex;
import com.example.spring_data_jpa_ex.model.Student;
import com.example.spring_data_jpa_ex.model.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2= context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

		s1.setRollNo(11);
		s1.setMarks(100);
		s1.setName("Aniket");

		s2.setRollNo(22);
		s2.setMarks(99);
		s2.setName("Yash");

		s3.setRollNo(33);
		s3.setMarks(98);
		s3.setName("Aryan");

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);

		System.out.println(repo.findById(22));

		System.out.println(repo.findByName("Aniket"));
		System.out.println(repo.findByMarks(100));

		repo.delete(s2);

	}

}
