package com.mycompany.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    /**
     * Méthode pour tester la recherche d'un élément dans un HashSet.
     * La recherche dans un HashSet a une complexité moyenne de O(1), 
     * car elle utilise une table de hachage pour accéder directement à l'élément.
     */
    public void testContains() {
        // Création d'un HashSet avec les mêmes éléments
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        
        // Mesurer le temps de recherche pour l'élément "C"
        long startTime = System.nanoTime(); // Début de la mesure
        boolean exists = set.contains("C"); // Recherche basée sur le hachage
        long endTime = System.nanoTime(); // Fin de la mesure
        
        // Afficher le résultat et le temps pris
        System.out.println("Existe (HashSet) : " + exists);
        System.out.println("Temps pris (HashSet) : " + (endTime - startTime) + " nanoseconds");
    }
}

