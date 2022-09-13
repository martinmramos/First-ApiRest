package com.example.firstapiRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpositionController {

    @GetMapping("/expositions")
    public void getExpositions() {
        System.out.println("Aquí tiene el listado de exposiciones.");
    }

    @GetMapping("/exposition/{num}/cars")
    public void getCarsByExposition(@PathVariable String num){
        System.out.println("Los coches de la exposición " + num + " son los siguientes.");
    }

}
