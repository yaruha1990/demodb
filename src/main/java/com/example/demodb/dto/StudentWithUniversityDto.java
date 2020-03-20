package com.example.demodb.dto;

import lombok.Data;

@Data
public class StudentWithUniversityDto {
    private String name;
    private UniversityWOStudentDto universityDto;
}
