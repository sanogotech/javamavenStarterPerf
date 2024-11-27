package com.mycompany.app;

public class TestPerformanceStringConcatManual {
    public void execute() {
        String result = "";
        // Boucle pour concaténer des nombres sous forme de chaîne
        for (int i = 0; i < 10000; i++) {
            result += i;  // Mauvaise pratique : chaque concaténation crée un nouvel objet String
        }
    }
}

