package com.mycompany.app;

public class TestPerformanceLoopOptimized {
    public void execute() {
        int[] numbers = new int[100000];
        int length = numbers.length; // La taille est stockée une seule fois avant la boucle
        for (int i = 0; i < length; i++) {
            numbers[i] = i * 2; // Optimisation de la boucle avec la taille pré-calculée
        }
    }
}
