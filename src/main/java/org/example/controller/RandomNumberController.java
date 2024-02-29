package org.example.controller;

import org.example.model.RandomNumber;
import org.example.service.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

// Controlador que maneja las solicitudes relacionadas con números aleatorios.
@RestController
@RequestMapping("/random")
public class RandomNumberController {

    // Servicio para generar números aleatorios.
    private final RandomNumberService randomNumberService;

    // Constructor para inyectar el servicio de números aleatorios.
    @Autowired
    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    // Endpoint para obtener una lista de 100 números aleatorios.
    @GetMapping("/numbers")
    public List<Integer> getRandomNumbers() {
        return randomNumberService.getRandomNumbers();
    }

    // Endpoint para obtener un número aleatorio con un número específico de dígitos.
    @GetMapping("/number/{d}")
    public int getRandomNumber(@PathVariable int d) {
        return randomNumberService.getRandomNumber(d);
    }

    /*
     Endpoint para generar un número aleatorio basado en un número aleatorio proporcionado. Un ejemplo para que funcione seria este {"random": 12345}
     */
    @PutMapping("/number")
    public int generateRandomNumber(@RequestBody RandomNumber randomNumber) {
        return randomNumberService.generateRandomNumber(randomNumber);
    }
}

