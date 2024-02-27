package com.example.demo.prueba1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellospring {
        
        @GetMapping("/")
        public String index() {
            return "Greetings from Spring Boot!";
        }
}

