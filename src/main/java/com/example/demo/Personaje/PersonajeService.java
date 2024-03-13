package com.example.demo.Personaje;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class PersonajeService {
    private final PersonajeRepository personajeRepository;
    public PersonajeService(PersonajeRepository personajeRepository){
        this.personajeRepository = personajeRepository;
    }
    public List<Personaje> getPersonajes(){
	    return personajeRepository.findAll();
}
    public void addNewPersonaje(Personaje personaje) {
        Optional<Personaje> personajeOptional =personajeRepository.findPersonajeByName(personaje.getName());
        if (personajeOptional.isPresent()){
            throw new IllegalStateException("Nombre ya tomado");
        }
        personajeRepository.save(personaje);
        System.out.println(personaje);
    }
}
