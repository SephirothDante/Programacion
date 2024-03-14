package com.example.demo.Personaje;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class welcomeSpring {

        @GetMapping("/")
    public RedirectView redirect(){
        return new RedirectView("api/v1/personajes");
    }
}

