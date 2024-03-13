package com.example.demo.Personaje;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonajeConfig {
    @SuppressWarnings("null")
    @Bean
    CommandLineRunner commandLineRunner(PersonajeRepository repository){
        return args -> {
            Personaje cloud = new Personaje("Cloud", 21, "Midgard");
            Personaje aerith = new Personaje("Aerith", 20, "Midgard");
            repository.saveAll(List.of(cloud, aerith));
        };
    }
}
