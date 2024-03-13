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
    @SuppressWarnings("null")
    public void deletePersonaje(Long personajeId){
        boolean exists = personajeRepository.existsById(personajeId);
        if(!exists){
            throw new IllegalStateException("El personaje con el Id " + personajeId + " no existe");
        }
        personajeRepository.deleteById(personajeId);
    }
}
