package com.mycompany.app;

import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    /**
     * Méthode pour tester la recherche d'un élément dans une ArrayList.
     * La recherche dans une ArrayList a une complexité de O(n) car 
     * elle parcourt la liste séquentiellement pour trouver l'élément.
     */
    public void testContains() {
        // Création d'une ArrayList avec quelques éléments
        List<String> list = Arrays.asList("A", "B", "C", "D");
        
        // Mesurer le temps de recherche pour l'élément "C"
        long startTime = System.nanoTime(); // Début de la mesure
        boolean exists = list.contains("C"); // Recherche séquentielle
        long endTime = System.nanoTime(); // Fin de la mesure
        
        // Afficher le résultat et le temps pris
        System.out.println("Existe (ArrayList) : " + exists);
        System.out.println("Temps pris (ArrayList) : " + (endTime - startTime) + " nanoseconds");
    }
}

