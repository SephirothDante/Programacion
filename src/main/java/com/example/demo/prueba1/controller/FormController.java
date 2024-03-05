package com.example.demo.prueba1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/form")
public class FormController {

    public static final String FORM_VIEW = "form";
    public static final String RESULT_VIEW = "resultado";

    @RequestMapping("/verform")
    public String showForm(Model model){
        model.addAttribute("persona", new Persona());
        return FORM_VIEW;
    }

    @PostMapping("/addpersona")
    public ModelAndView addPersona(@ModelAttribute("persona") Persona personaForm){
        ModelAndView mav = new ModelAndView(RESULT_VIEW);
        mav.addObject("persona", new Persona(personaForm.getNombre(),personaForm.getEdad()));
        return mav;
    }

}