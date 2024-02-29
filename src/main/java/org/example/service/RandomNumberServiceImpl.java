package org.example.service;

import org.example.model.RandomNumber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Implementación del servicio de números aleatorios.
@Service
public class RandomNumberServiceImpl implements RandomNumberService {

    // Método para generar una lista de 100 números aleatorios.
    @Override
    public List<Integer> getRandomNumbers() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }

    // Método para generar un número aleatorio con un número específico de dígitos.
    @Override
    public int getRandomNumber(int d) {
        Random random = new Random();
        int min = (int) Math.pow(10, d - 1);
        int max = (int) Math.pow(10, d) - 1;
        return random.nextInt(max - min + 1) + min;
    }

    // Método para generar un número aleatorio basado en un número aleatorio proporcionado.
    @Override
    public int generateRandomNumber(RandomNumber randomNumber) {
        Random random = new Random();
        int min = (int) Math.pow(10, String.valueOf(randomNumber.getRandom()).length() - 1);
        int max = (int) Math.pow(10, String.valueOf(randomNumber.getRandom()).length()) - 1;
        return random.nextInt(max - min + 1) + min;
    }
}
