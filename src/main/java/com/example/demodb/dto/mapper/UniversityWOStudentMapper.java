package com.example.demodb.dto.mapper;

import com.example.demodb.domain.University;
import com.example.demodb.dto.UniversityWOStudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UniversityWOStudentMapper {

    @Mapping(target = "name", source = "university.name")
    UniversityWOStudentDto universityToDto(University university);

    @Mapping(target = "name", source = "universityDto.name")
    University universityDtoToUniversity(UniversityWOStudentDto universityDto);

}
