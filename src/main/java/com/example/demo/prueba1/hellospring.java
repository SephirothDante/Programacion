package com.example.demo.prueba1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class hellospring {
        @GetMapping("/")
    public RedirectView redirect(){
        return new RedirectView("student/signin");
    }
        @GetMapping("/home")
        public String index() {
            return "Greetings from Spring Boot!";
        }
}

