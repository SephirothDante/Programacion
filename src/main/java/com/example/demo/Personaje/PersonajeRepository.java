package com.example.demo.Personaje;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje,Long > {
    //SELECT *FROM personajes Where name = ?
    @Query("SELEC s FROM Personaje s Where s.name = ?1")
    Optional<Personaje> findPersonajeByName(String name);
    @Query("SELEC s FROM Personaje_secuencia s Where s.id = ?1")
    Optional<Personaje> findPersonajeById(Long id);
}