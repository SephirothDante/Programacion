package com.example.demo.prueba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/parametros")
public class RequestParamController {

        private static final String TEMPLATE_VIEW = "datos";

        @GetMapping("/request")
        public ModelAndView getRequest(@RequestParam(name="nombre", required=false, defaultValue="Falta dato") String nombreReq){
            ModelAndView mav = new ModelAndView(TEMPLATE_VIEW);
            mav.addObject("dato_nombre", nombreReq);
            return mav;
        }

        @GetMapping("/request2/{nombre}")
        public ModelAndView getRequest2(@PathVariable(name="nombre") String nombreReq ){
            ModelAndView mav = new ModelAndView(TEMPLATE_VIEW);
            mav.addObject("dato_nombre", nombreReq);
            return mav;
        }
}