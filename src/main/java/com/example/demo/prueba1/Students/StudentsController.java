package com.example.demo.prueba1.Students;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;

@Controller
@RequestMapping("/students")
public class StudentsController {
    public static final String TEMPLATE = "students";
    @GetMapping("/")
    public String Estudiantes(Model model){
        model.addAttribute("students", getStudent());
        System.out.println(model);
        return TEMPLATE;
    }
    @RequestMapping("/stl")
        public ModelAndView datosComplejosMAV() {
            ModelAndView mav = new ModelAndView(TEMPLATE);
            mav.addObject("students",  getStudent());
            System.out.println(mav);
            return mav;
        }

    private List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16)));
        students.add(new Student(2L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16)));
        students.add(new Student(3L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16)));
        students.add(new Student(4L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16)));
        students.add(new Student(5L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16)));
        return students;
    }
}
