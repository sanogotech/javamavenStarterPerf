package com.mycompany.app;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequentialStreamExampleNano {
	
    public static void main(String[] args) {
        // Création d'une liste de 1 à 1 000 000
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000)
                                         .boxed()
                                         .collect(Collectors.toList());
        
        // Mesure du temps pour le traitement séquentiel
        long startTime = System.nanoTime(); // Début du chronométrage
        
        // Traitement séquentiel des données
        long sum = numbers.stream()
                          .mapToInt(Integer::intValue)
                          .sum();
        
        long endTime = System.nanoTime(); // Fin du chronométrage
        
        System.out.println("Somme: " + sum);
        // Affichage du temps en millisecondes (nanoTime retourne en nanosecondes)
        System.out.println("Temps (séquentiel): " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
