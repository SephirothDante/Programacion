package com.example.demo.prueba1.Students;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;

@Controller
@RequestMapping("/student/signin")
public class signinstudent {
    private Long idt = 0L;
    public static final String FORM_VIEW = "formstudent";
    public static final String RESULT_VIEW = "addstudent";

    @RequestMapping()
    public String showForm(Model model){
        model.addAttribute("Student", new Student());
        return FORM_VIEW;
    }

    @PostMapping("/addstudent")
    public ModelAndView addPersona(@ModelAttribute("Student") Student StudentForm){
        ModelAndView mav = new ModelAndView(RESULT_VIEW);
        this.idt = idt + 1L;
        mav.addObject("Student", new Student(idt,StudentForm.getName(),StudentForm.getEmail(),StudentForm.getAge(),StudentForm.getDob()));
        return mav;
    }

}