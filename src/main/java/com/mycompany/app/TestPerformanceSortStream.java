package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPerformanceSortStream {
    public void execute() {
        List<Integer> numbers = new ArrayList<>();
        // Remplissage de la liste avec des valeurs décroissantes
        for (int i = 10000; i > 0; i--) {
            numbers.add(i);
        }
        
        // Tri optimisé avec Stream, utilisant des algorithmes internes plus performants
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
    }
}
