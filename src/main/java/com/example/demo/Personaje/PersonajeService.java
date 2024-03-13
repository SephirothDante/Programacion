package com.example.demo.Personaje;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

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

    @Transactional
    public void updatePersonaje(Long personajeId, String name, Integer age, String Bplace){
        @SuppressWarnings("null")
        Personaje personaje = personajeRepository.findById(personajeId).orElseThrow(() -> new IllegalStateException(
            "El personaje con id " + personajeId + "no existe"));
        if (name!= null && name.length() > 0 && !Objects.equals(personaje.getName(),name)){
            personaje.setName(name);
        };
        if (Bplace!= null && Bplace.length() > 0 && !Objects.equals(personaje.getBplace(),Bplace)){
            personaje.setBplace(Bplace);
        };
        if (age!= null && age.intValue() > 0 && !Objects.equals(personaje.getAge(),age)){
            personaje.setAge(age);
        };
    }

}
