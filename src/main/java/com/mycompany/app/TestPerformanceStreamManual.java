package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class TestPerformanceStreamManual {
    public void execute() {
        List<Integer> numbers = new ArrayList<>();
        // Remplissage de la liste avec des valeurs
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        // Boucle pour filtrer les nombres pairs
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);  // Méthode classique mais moins optimisée
            }
        }
    }
}

