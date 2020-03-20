package com.example.demodb.dto.mapper;

import com.example.demodb.domain.Student;
import com.example.demodb.dto.StudentWithUniversityDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = UniversityWOStudentMapper.class)
public interface StudentWithUniversityMapper {

    @Mapping(target = "name", source = "student.name")
    @Mapping(target = "universityDto", source = "student.university")
    StudentWithUniversityDto studentToDto(Student student);

    @Mapping(target = "name", source = "studentDto.name")
    @Mapping(target = "university", source = "studentDto.universityDto")
    Student studentDtoToStudent(StudentWithUniversityDto studentDto);

}
