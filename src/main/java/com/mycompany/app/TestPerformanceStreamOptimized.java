package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPerformanceStreamOptimized {
    public void execute() {
        List<Integer> numbers = new ArrayList<>();
        // Remplissage de la liste avec des valeurs
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }

        // Utilisation d'un flux de données pour filtrer de manière plus efficace
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)  // Filtrage des éléments pairs de manière fluide
                                           .collect(Collectors.toList());
    }
}

