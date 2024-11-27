package com.mycompany.app;

public class TestPerformanceLoopManual {
    public void execute() {
        int[] numbers = new int[100000];
        // Boucle recalculant la taille de l'array à chaque itération (inefficace)
        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = i * 2;
        }
    }
}
