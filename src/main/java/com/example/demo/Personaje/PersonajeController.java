package com.example.demo.Personaje;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public void registerNewPersonaje(@RequestBody Personaje personaje){
        personajeService.addNewPersonaje(personaje);
    }

    @DeleteMapping(path = {"personajeId"})
    public void deletePersonaje(@PathVariable("personajeId") Long personajeId){
        personajeService.deletePersonaje(personajeId);
    }
}
