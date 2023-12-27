package com.example.Studentsapi.service;

import com.example.Studentsapi.dto.StudentDto;
import com.example.Studentsapi.repositoty.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Studentsapi.entity.Student;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student save(StudentDto studentDto)
    {
        Student student = new Student()
                .setName(studentDto.getName())
                .setBirthDay(studentDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
        return studentRepository.save(student);
    }

    public Iterable<Student> getAll(){
        return studentRepository.findAll();
    }
}
