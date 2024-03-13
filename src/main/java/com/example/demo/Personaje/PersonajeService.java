package com.example.demo.Personaje;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {
    private final PersonajeRepository personajeRepository;
    @Autowired
    public PersonajeService(PersonajeRepository personajeRepository){
        this.personajeRepository = personajeRepository;
    }
    public List<Personaje> getPersonajes(){
	    return personajeRepository.findAll();
}
}
