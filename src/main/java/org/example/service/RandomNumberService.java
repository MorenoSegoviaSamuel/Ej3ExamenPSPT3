package org.example.service;

import org.example.model.RandomNumber;

import java.util.List;

// Interfaz que define los métodos para generar números aleatorios.
public interface RandomNumberService {
    List<Integer> getRandomNumbers();

    int getRandomNumber(int d);

    int generateRandomNumber(RandomNumber randomNumber);
}
