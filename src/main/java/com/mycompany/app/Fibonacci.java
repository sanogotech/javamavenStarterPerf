package com.mycompany.app;

public class Fibonacci {
    public long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        
        // Mesure du temps avant l'exécution
        long startTime = System.nanoTime();
        
        // Calcul répétitif sans mise en cache
        System.out.println(fib.fibonacci(40));  // Calcul long
        System.out.println(fib.fibonacci(40));  // Calcul encore long
        
        // Mesure du temps après l'exécution
        long endTime = System.nanoTime();
        
        long duration = (endTime - startTime);  // Durée en nanosecondes
        System.out.println("Temps d'exécution sans cache : " + duration + " ns");
    }
}
