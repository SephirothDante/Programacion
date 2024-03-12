package com.example.demo.Personaje;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "api/v1/personajes")
public class PersonajeController {
    private final PersonajeService personajeService;

    public PersonajeController(PersonajeService personajeService){
        this.personajeService =personajeService;

    }
    @GetMapping
    public List<Personaje> getPersonajes(){
        return personajeService.getPersonajes();
}
}
