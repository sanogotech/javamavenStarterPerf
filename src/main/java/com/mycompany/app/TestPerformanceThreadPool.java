package com.mycompany.app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPerformanceThreadPool {
    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executor.submit(() -> System.out.println("Tâche " + taskId + " exécutée par " + Thread.currentThread().getName()));
        }

        executor.shutdown();
    }
}

