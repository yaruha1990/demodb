package com.example.demodb.dto.mapper;

import com.example.demodb.domain.Student;
import com.example.demodb.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(target = "name", source = "student.name")
    StudentDto studentToDto(Student student);

    @Mapping(target = "name", source = "studentDto.name")
    Student studentDtoToStudent(StudentDto studentDto);

}
