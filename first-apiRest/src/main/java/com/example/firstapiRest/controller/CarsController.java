package com.example.firstapiRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

    @GetMapping("/cars")
    public void getCars() {
        System.out.println("Aquí tiene el listado de coches.");
    }

    @GetMapping("/car/{id}")
    public void getCarById(@PathVariable String id) {
        System.out.println("Mostrando los datos del coche con ID " + id);
    }

    @GetMapping("/car/{id}/owner")
    public void getOwnerByCarId(@PathVariable String id) {
        System.out.println("Mostrando el propietario del coche con ID " + id);
    }


}
