package com.example.demo.prueba1.components;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class EjemploComponent {
    private static final Log LOG = LogFactory.getLog(EjemploComponent.class); 
        
    @Bean
    public Log showInLog(){
        LOG.info("Log desde componente");
    return LOG;
    }

}