package com.example.demo.prueba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/example")

public class EjemploController {
public static final String EJEMPLO_VIEW ="ejemplo";
    @GetMapping("/ejemploString")
        public String ejemploString(){
        return EJEMPLO_VIEW;
        }
    
    @RequestMapping(value = "/ejemplomav", method = RequestMethod.GET)
    public ModelAndView ejemploMAV(){
        return new ModelAndView(EJEMPLO_VIEW);
    }
    



}
