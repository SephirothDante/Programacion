package com.example.demo.Personaje;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
@RequestMapping(path = "api/v1/personajes")
public class PersonajeController {
    public static final String TEMPLATE ="personajes";
    private final PersonajeService personajeService;
    
    public PersonajeController(PersonajeService personajeService){
        this.personajeService =personajeService;

    }
    @GetMapping("")
    public ModelAndView ListaPersonajesMAV() {
        ModelAndView mav = new ModelAndView(TEMPLATE);
        mav.addObject("personajes", getPersonajes());
        return mav;
    }

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

    @PutMapping(path = "{personajeId}")
    public void updatePersonaje(@PathVariable("personajeId") Long personajeId, @RequestParam(required = false) String name,@RequestParam(required = false) String Bplace, @RequestParam(required = false) Integer age) {
        personajeService.updatePersonaje(personajeId,name,age,Bplace);
    }

}
