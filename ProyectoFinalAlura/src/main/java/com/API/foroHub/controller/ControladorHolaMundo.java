package com.API.foroHub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class ControladorHolaMundo {
    @GetMapping
    public String helloWorld() {
        return "Hola mundo de Spring!";
    }
}
