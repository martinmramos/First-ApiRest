package com.example.firstapiRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

    @GetMapping("/cars")
    public void getCars(){
        System.out.println("Aquí tiene el listado de coches.");
    }

    @GetMapping("/car/{id}")
    public void getCarById(@PathVariable String id){
        System.out.println("Mostrando los datos del coche con ID " + id);
    }

    @GetMapping("/car/{id}/{owner}")
    public void getOwnerByCarId (@PathVariable String id, @PathVariable String owner){
        System.out.println("El propietario del coche con ID " + id + " es: " + owner);
    }

    @GetMapping("/car/{id}/exposition/{num}")
    public void getCarByIdAndExpositionByNumber(@PathVariable String id, @PathVariable String num){
        System.out.println("Los datos del coche " + id + " en la exposición " + num + " son los siguientes.");
    }
}
