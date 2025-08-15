# Student Management System

A simple Student Management System web application built using Spring Boot, Spring MVC, Thymeleaf, Spring Data JPA, and MySQL database.  
This project allows you to manage students by performing basic CRUD (Create, Read, Update, Delete) operations.

📌 Objective
The main objective of this project is to demonstrate the development of a complete Spring Boot web application from scratch for beginners.

## 📂 Project Structure
  Student_Management_System/
├── .idea/
├── Student_Management_System/
│ ├── .mvn/
│ └── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── sms/
│ │ └── Student_Management_System/
│ │ ├── Controller/
│ │ │ └── StudentController.java
│ │ ├── Entity/
│ │ │ └── Student.java
│ │ ├── repository/
│ │ │ └── StudentRepository.java
│ │ ├── Service/
│ │ │ └── impl/
│ │ │ └── StudentService.java
│ │ └── StudentManagementSystemApplication.java
│ └── resources/
│ ├── static/
│ └── templates/

# 🛠️ Tech Stack
- Java 24
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- MySQL
- Thymeleaf
- IntelliJ IDEA

# ⚙️ Features
- Add a new student  
- View list of students  
- Update student details  
- Delete a student

## 🚀 Setup Instructions

  ```bash
  # 1. Clone the repository
  git clone https://github.com/Prathamesh10S/student-management-system.git
  cd student-management-system

  # 2. Configure MySQL Database
  # Create a new MySQL database (e.g., student_management)
  # Then update application.properties with your database credentials:
  spring.datasource.url=jdbc:mysql://localhost:3306/student_management
  spring.datasource.username=root
  spring.datasource.password=yourpassword
  spring.jpa.hibernate.ddl-auto=update

  # 3. Build and Run
  mvn spring-boot:run

  # 4. Access the Application
  # Open a browser and navigate to:
  http://localhost:8080/students

Thank You!
