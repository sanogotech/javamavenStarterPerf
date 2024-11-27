package com.mycompany.app;

public class TestFULLThreadIOBufferPerformance {
    public static void main(String[] args) throws Exception {
        // Gestion des threads
        TestPerformanceThreadManual manualThreads = new TestPerformanceThreadManual();
        TestPerformanceThreadPool poolThreads = new TestPerformanceThreadPool();

        long startManualThreads = System.nanoTime();
        manualThreads.execute();
        long endManualThreads = System.nanoTime();

        long startPoolThreads = System.nanoTime();
        poolThreads.execute();
        long endPoolThreads = System.nanoTime();

        System.out.println("Temps Threads manuels : " + (endManualThreads - startManualThreads) + " ns");
        System.out.println("Temps Thread Pool : " + (endPoolThreads - startPoolThreads) + " ns");

        // Gestion des entrées/sorties
        TestPerformanceIOManual ioManual = new TestPerformanceIOManual();
        TestPerformanceIOBuffer ioBuffer = new TestPerformanceIOBuffer();

        long startIOManual = System.nanoTime();
        ioManual.execute();
        long endIOManual = System.nanoTime();

        long startIOBuffer = System.nanoTime();
        ioBuffer.execute();
        long endIOBuffer = System.nanoTime();

        System.out.println("Temps IO sans buffer : " + (endIOManual - startIOManual) + " ns");
        System.out.println("Temps IO avec buffer : " + (endIOBuffer - startIOBuffer) + " ns");
    }
}
