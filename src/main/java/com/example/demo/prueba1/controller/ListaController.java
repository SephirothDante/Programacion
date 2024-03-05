package com.example.demo.prueba1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;


@Controller
@RequestMapping("/lista")
public class ListaController {
    public static final String TEMPLATE ="lista";
    @GetMapping("/")
        public String Personas(Model model) {
        model.addAttribute("personas", getPersonas());
        System.out.println(model);
        return TEMPLATE;
    }
    @RequestMapping("/listamav")
        public ModelAndView datosComplejosMAV() {
            ModelAndView mav = new ModelAndView(TEMPLATE);
            mav.addObject("persona",  getPersonas());
            return mav;
        }

    private List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 33));
        personas.add(new Persona("Maria", 23));
        personas.add(new Persona("Diego", 32));
        personas.add(new Persona("Pedro", 37));

        return personas;
    }
}