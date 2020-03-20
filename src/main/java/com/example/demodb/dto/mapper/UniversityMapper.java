package com.example.demodb.dto.mapper;

import com.example.demodb.domain.University;
import com.example.demodb.dto.UniversityDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = StudentMapper.class)
public interface UniversityMapper {

    @Mapping(target = "name", source = "university.name")
    @Mapping(target = "studentDtos", source = "university.students")
    UniversityDto universityToDto(University university);

    @Mapping(target = "name", source = "universityDto.name")
    @Mapping(target = "students", source = "universityDto.studentDtos")
    University universityDtoToUniversity(UniversityDto universityDto);

}
