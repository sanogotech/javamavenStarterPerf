package com.mycompany.app;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExampleNano {
    public static void main(String[] args) {
        // Création d'une liste de 1 à 1 000 000
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000)
                                         .boxed()
                                         .collect(Collectors.toList());
        
        // Mesure du temps pour le traitement parallèle
        long startTime = System.nanoTime(); // Début du chronométrage
        
        // Traitement parallèle des données
        long sum = numbers.parallelStream()
                          .mapToInt(Integer::intValue)
                          .sum();
        
        long endTime = System.nanoTime(); // Fin du chronométrage
        
        System.out.println("Somme: " + sum);
        // Affichage du temps en millisecondes (nanoTime retourne en nanosecondes)
        System.out.println("Temps (parallèle): " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
