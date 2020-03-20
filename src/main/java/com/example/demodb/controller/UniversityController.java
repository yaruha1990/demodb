package com.example.demodb.controller;

import com.example.demodb.dto.UniversityDto;
import com.example.demodb.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping("/university")
@RequiredArgsConstructor
@CrossOrigin
public class UniversityController {
    private final UniversityService universityService;

    @GetMapping("/{id}")
    public Optional<UniversityDto> getUniversity(@PathVariable("id") long id) {
        return universityService.findById(id);
    }

    @PostMapping("/login")
    public void handleForm(HttpServletRequest request) {
        System.out.println(request.getParameter("login"));
    }
}
