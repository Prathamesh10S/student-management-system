package com.sms.Student_Management_System;

import com.sms.Student_Management_System.Entity.Student;
import com.sms.Student_Management_System.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student s1 = new Student("Prathamesh", "Salunke", "pratham@gmail.com");
//		studentRepository.save(s1);
//
//		Student s2 = new Student("Taty", "Vinchu", "taty@gmail.com");
//		studentRepository.save(s2);
//
//		Student s3 = new Student("Alien", "Bhut", "alien@gmail.com");
//		studentRepository.save(s3);
//
//		Student s4 = new Student("champa", "robo", "champa@gmail.com");
//		studentRepository.save(s4);
//
//		Student s5 = new Student("Ayush", "Badoni", "aysh@gmail.com");
//		studentRepository.save(s5);
//
//		Student s6 = new Student("Harsh", "Jadhav", "harsh@gmail.com");
//		studentRepository.save(s6);
//
//		Student s7 = new Student("ram", "charan", "ram@gmail.com");
//		studentRepository.save(s7);



	}

}
