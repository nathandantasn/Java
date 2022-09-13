package br.anhembi.anhembi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Esta classe é um controller REST
@CrossOrigin("*") // Aceita requisições de qualquer domínio
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public String ola () {
        return "Boa noite";
    }

    @GetMapping("/noite")
    public String ola2 () {
        return "Olá, Boa noite";
    }

}
