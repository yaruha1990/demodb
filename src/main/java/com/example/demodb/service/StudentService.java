package com.example.demodb.service;

import com.example.demodb.domain.Student;
import com.example.demodb.dto.StudentDto;
import com.example.demodb.dto.StudentWithUniversityDto;
import com.example.demodb.dto.mapper.StudentMapper;
import com.example.demodb.dto.mapper.StudentWithUniversityMapper;
import com.example.demodb.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper mapper;
    private final StudentWithUniversityMapper studentWithUniversityMapper;

    public Optional<StudentDto> findById(long id) {
        Optional<Student> student = studentRepo.findById(id);
        return student.map(mapper::studentToDto);
    }

    public Optional<StudentWithUniversityDto> findStudentById(long id) {
        Optional<Student> student = studentRepo.findById(id);
        return student.map(studentWithUniversityMapper::studentToDto);
    }
}
