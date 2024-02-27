package com.example.demo.estudiantes;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentsController {
    @GetMapping
    public List<Student> getStudent() {
        return List.of(
            new Student(1L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16))
        );
    }
}
