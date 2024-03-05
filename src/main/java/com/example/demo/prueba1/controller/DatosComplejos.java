package com.example.demo.prueba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;



@Controller
@RequestMapping("/complejo")
public class DatosComplejos {

    public static final String TEMPLATE ="complejo";
    @GetMapping("/datocompleto")
    public String datosComplejos(Model model) {
        model.addAttribute("persona",new Persona("Fespi",36));
        return TEMPLATE;
    }
    @RequestMapping("/datocompletomav")
        public ModelAndView datosComplejosMAV() {
            ModelAndView mav = new ModelAndView(TEMPLATE);
            mav.addObject("persona", new Persona("Daniel", 33));
            return mav;
        }
        
}
