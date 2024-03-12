package com.example.demo.Personajes;

public class personaje {
private Long id;
private String name;
private Integer age;

    public personaje(Long id, String name, Integer age, String bplace) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bplace = bplace;
    }
private String bplace;

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
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBplace() {
        return this.bplace;
    }

    public void setBplace(String bplace) {
        this.bplace = bplace;
    }

public personaje(){

}

    public personaje(String name, Integer age, String bplace) {
        this.name = name;
        this.age = age;
        this.bplace = bplace;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", bplace='" + getBplace() + "'" +
            "}";
    }

}
