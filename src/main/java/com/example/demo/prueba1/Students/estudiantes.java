package com.example.demo.prueba1.Students;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;

@Controller
@RequestMapping("/estudiantes")
public class estudiantes {
    public static final String TEMPLATE ="estudiante";
@GetMapping("/datocompleto")
    public String datosComplejos(Model model) {
        model.addAttribute("persona",new Student(1L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16)));
        return TEMPLATE;
    }
    @RequestMapping("/v1")
    public ModelAndView datosEstudiante(){
        ModelAndView mav = new ModelAndView(TEMPLATE);
        mav.addObject("estudiante", new Student(1L, "Fespi", "fforetro@gmai.com", 35, LocalDate.of(1987, Month.APRIL, 16)));
        System.out.println(mav);
        return mav;
    }
}
