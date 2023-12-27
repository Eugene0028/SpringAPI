package com.example.Studentsapi.repositoty;

import com.example.Studentsapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, String> {
}
