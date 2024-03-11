package com.example.demo.prueba1.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ESTUDIANTES")
public class estudiante {
    @Id
    @GeneratedValue(generator="ESTUDIANTE")
    @SequenceGenerator(name="ESTUDIANTE", sequenceName="SEQ_ESTUDIANTE")
    @Column(name="ID")
    private Long id;
    @Column(name="NAME")
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="AGE")
    private Integer age;
    @Column(name="DOB")
    private LocalDate dob;
    
    public estudiante(Long id, String name, String email, Integer age, LocalDate dob) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    
}