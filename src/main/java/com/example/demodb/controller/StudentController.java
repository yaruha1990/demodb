package com.example.demodb.controller;

import com.example.demodb.dto.StudentDto;
import com.example.demodb.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/{id}")
    public Optional<StudentDto> getStudent(@PathVariable("id") long id) {
        return studentService.findById(id);
    }
}
