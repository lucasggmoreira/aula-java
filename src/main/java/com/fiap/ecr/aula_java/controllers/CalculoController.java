package com.fiap.ecr.aula_java.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculoController {

    @GetMapping("/calculo/{num1}/{num2}")
    public double soma(@PathVariable double num1, @PathVariable double num2) {
        return num1 + num2;
    }

}
