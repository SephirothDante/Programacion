package com.example.demo.Personaje;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonajeService {
    public List<Personaje> getPersonajes(){
	    return List.of(new Personaje(1L, "Cloud", 21, "Midgard"));
}
}
