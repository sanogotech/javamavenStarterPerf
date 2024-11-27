package com.mycompany.app;

public class TestPerformanceStringConcatOptimized {
    public void execute() {
        StringBuilder result = new StringBuilder();  // Utilisation de StringBuilder qui optimise la gestion des chaînes
        // Boucle pour concaténer des nombres sous forme de chaîne
        for (int i = 0; i < 10000; i++) {
            result.append(i);  // StringBuilder évite de créer de nouveaux objets à chaque concaténation
        }
    }
}
