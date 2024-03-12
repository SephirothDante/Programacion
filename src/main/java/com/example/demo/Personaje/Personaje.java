package com.example.demo.Personaje;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Personaje {
    @Id
    @SequenceGenerator(name = "personaje_secuencia", sequenceName = "personaje_secuencia", allocationSize = 1 )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "personaje_secuencia")
private Long id;
private String name;
private Integer Age;
private String Bplace;

    public Personaje() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getBplace() {
        return this.Bplace;
    }

    public void setBplace(String Bplace) {
        this.Bplace = Bplace;
    }

    public Personaje(Long id, String name, Integer Age, String Bplace) {
        this.id = id;
        this.name = name;
        this.Age = Age;
        this.Bplace = Bplace;
    }

    public Personaje(String name, Integer Age, String Bplace) {
        this.name = name;
        this.Age = Age;
        this.Bplace = Bplace;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", Age='" + getAge() + "'" +
            ", Bplace='" + getBplace() + "'" +
            "}";
    }

}
