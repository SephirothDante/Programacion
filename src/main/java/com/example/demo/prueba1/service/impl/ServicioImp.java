package com.example.demo.prueba1.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo.prueba1.model.Persona;
import com.example.demo.prueba1.service.EjemploServPersona;
@ComponentScan({"com.example.demo"})

@Service("EjemploServPersona")
public class ServicioImp implements EjemploServPersona {

    @Override
    public List<Persona> getListaPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 33));
        personas.add(new Persona("Maria", 23));
        personas.add(new Persona("Diego", 32));
        personas.add(new Persona("Diego", 32));

        return personas;
    }
}