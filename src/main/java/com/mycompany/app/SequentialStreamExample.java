package com.mycompany.app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequentialStreamExample {
    public static void main(String[] args) {
        // Création d'une liste de 1 à 1 000 000
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000)
                                         .boxed()
                                         .collect(Collectors.toList());
        
        long startTime = System.currentTimeMillis(); // Début du chronométrage
        
        // Traitement séquentiel des données
        long sum = numbers.stream()
                          .mapToInt(Integer::intValue)
                          .sum();
        
        long endTime = System.currentTimeMillis(); // Fin du chronométrage
        
        System.out.println("Somme: " + sum);
        System.out.println("Temps (séquentiel): " + (endTime - startTime) + " ms");
    }
}