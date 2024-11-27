package com.mycompany.app;

public class TestPerformanceThreadManual {
    public void execute() {
        for (int i = 0; i < 10; i++) {
            int taskId = i;
            new Thread(() -> System.out.println("Tâche " + taskId + " exécutée par " + Thread.currentThread().getName())).start();
        }
    }
}

