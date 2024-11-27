package com.mycompany.app;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPerformanceSortManual {
    public void execute() {
        List<Integer> numbers = new ArrayList<>();
        // Remplissage de la liste avec des valeurs décroissantes
        for (int i = 10000; i > 0; i--) {
            numbers.add(i);
        }
        
        // Tri manuel utilisant Collections.sort(), moins efficace car cette méthode est moins optimisée
        Collections.sort(numbers); 
    }
}
