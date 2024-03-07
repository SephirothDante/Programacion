package com.example.demo.prueba1.service;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.example.demo.prueba1.model.Persona;
@ComponentScan({"com.example.demo"})

public interface EjemploServPersona {
    public abstract List<Persona> getListaPersonas();
}