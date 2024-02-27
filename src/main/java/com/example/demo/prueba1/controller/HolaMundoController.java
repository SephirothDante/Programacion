package com.example.demo.prueba1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/say")
public class HolaMundoController {
@GetMapping("/holamundo")
public String HolaMundo() {
    return "holamundo";
}
    
}
