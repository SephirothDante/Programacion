package com.example.demo.Personaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonajeRepository extends JpaRepository<Personaje,Long > {

    
}