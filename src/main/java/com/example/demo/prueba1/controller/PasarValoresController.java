package com.example.demo.prueba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
@RequestMapping("/val")

public class PasarValoresController {
    public static final String VALORES_VIEW = "pasovalores";

    @GetMapping("/pasovalor")
    public String valoreString(Model model) {
        model.addAttribute("nombre", "Juan Perez");
        return VALORES_VIEW;
    }
    
    @GetMapping("/pasovalormav")
    public ModelAndView valoresMaV(){
        ModelAndView mav = new ModelAndView(VALORES_VIEW);
        mav.addObject("nombre", "Juan");
        return mav;
    }
    
}
