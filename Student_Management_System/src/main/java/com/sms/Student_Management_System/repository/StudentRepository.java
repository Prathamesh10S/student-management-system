package com.sms.Student_Management_System.repository;

import com.sms.Student_Management_System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
