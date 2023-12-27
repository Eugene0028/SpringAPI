package com.example.Studentsapi.controller;

import com.example.Studentsapi.dto.StudentDto;
import com.example.Studentsapi.entity.Student;
import com.example.Studentsapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @PostMapping
    public Student save(@RequestBody StudentDto student)
    {
        return studentService.save(student);
    }
    @GetMapping
    public Iterable<Student> getAll(){
        return studentService.getAll();
    }
}
