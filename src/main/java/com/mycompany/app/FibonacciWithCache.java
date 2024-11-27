package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

public class FibonacciWithCache {
    private static Map<Integer, Long> cache = new HashMap<>();

    public long fibonacci(int n) {
        if (n <= 1) return n;
        
        // Vérification du cache
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);

        // Mise en cache du résultat
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        FibonacciWithCache fib = new FibonacciWithCache();
        
        // Mesure du temps avant l'exécution
        long startTime = System.nanoTime();
        
        // Calcul initial
        System.out.println(fib.fibonacci(40));  // Calcul initial
        
        // Lecture depuis le cache pour le même calcul
        System.out.println(fib.fibonacci(40));  // Lecture rapide depuis le cache
        
        // Mesure du temps après l'exécution
        long endTime = System.nanoTime();
        
        long duration = (endTime - startTime);  // Durée en nanosecondes
        System.out.println("Temps d'exécution avec cache : " + duration + " ns");
    }
}

