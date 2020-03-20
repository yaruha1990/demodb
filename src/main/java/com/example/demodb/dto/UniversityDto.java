package com.example.demodb.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UniversityDto {
    private String name;
    private Set<StudentDto> studentDtos;
}
