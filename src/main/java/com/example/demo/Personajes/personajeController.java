package com.example.demo.Personajes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/personajes")
public class personajeController {
@GetMapping("/")
public List<personaje> getPersonaje(){
    return List.of(
        new personaje(1l, "Cloud", 21, "Midgard")
    );
}
}
