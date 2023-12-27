package com.example.Studentsapi.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDto {
    private String name;
    private LocalDate birthDay;
}
