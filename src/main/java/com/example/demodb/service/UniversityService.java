package com.example.demodb.service;

import com.example.demodb.domain.University;
import com.example.demodb.dto.UniversityDto;
import com.example.demodb.dto.mapper.UniversityMapper;
import com.example.demodb.repository.UniversityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UniversityService {
    private final UniversityRepo universityRepo;
    private final UniversityMapper mapper;

    public Optional<UniversityDto> findById(long id) {
        Optional<University> university = universityRepo.findById(id);
        return university.map(mapper::universityToDto);
    }
}
