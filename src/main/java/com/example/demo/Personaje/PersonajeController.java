package com.example.demo.Personaje;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@ComponentScan
@RestController
@RequestMapping(path = "api/v1/personajes")
public class PersonajeController {
    public static final String TEMPLATE ="personajes";
    public static final String FORM_VIEW = "form";
    public static final String RESULT_VIEW = "addpersonaje";
    public static final String DELLETE = "delpersonaje";
    public static final String DELL_VIEW = "dell";
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

    @RequestMapping(value="/form", method = RequestMethod.GET)
    public ModelAndView showForm(){
        ModelAndView mav = new ModelAndView(FORM_VIEW);
        mav.addObject("personaje", new Personaje());
        return mav;
        }
        @RequestMapping(value="/dell", method = RequestMethod.GET)
    public ModelAndView showDell(){
        ModelAndView mav = new ModelAndView(DELL_VIEW);
        mav.addObject("personaje", new Personaje());
        return mav;
        }
        
    
    public void registerNewPersonaje(Personaje personaje){
        personajeService.addNewPersonaje(personaje);
    }

@PostMapping(path = "/addpersonaje", produces = "application/json")
    public ModelAndView addPersonaje(@ModelAttribute Personaje personajeForm){
        ModelAndView mav = new ModelAndView(RESULT_VIEW);
        registerNewPersonaje(personajeForm);
        mav.addObject("personaje", personajeForm);
        return mav;
    }

    @DeleteMapping(path = {"delpersonaje"})
    public ModelAndView delPersonaje(@ModelAttribute Personaje personajeForm){
        ModelAndView mav = new ModelAndView(DELLETE);
        deletePersonaje(personajeForm.getId());
        mav.addObject("personaje", personajeForm);
        return mav;
    }
    public void deletePersonaje(@PathVariable("personajeId") Long personajeId){
        personajeService.deletePersonaje(personajeId);
    }

    @PutMapping(path = "{personajeId}")
    public void updatePersonaje(@PathVariable("personajeId") Long personajeId, @RequestParam(required = false) String name,@RequestParam(required = false) String Bplace, @RequestParam(required = false) Integer age) {
        personajeService.updatePersonaje(personajeId,name,age,Bplace);
    }

}
