package com.mycompany.app;

public class TestFULLPerformanceStringConcatTriBoucleZip {
    public static void main(String[] args) throws Exception {
        // 1. Tri
        TestPerformanceSortManual sortManual = new TestPerformanceSortManual();
        TestPerformanceSortStream sortStream = new TestPerformanceSortStream();
        comparePerformance(sortManual, sortStream, "Tri des collections");

        // 2. Concaténation
        TestPerformanceStringConcatManual concatManual = new TestPerformanceStringConcatManual();
        TestPerformanceStringConcatOptimized concatOptimized = new TestPerformanceStringConcatOptimized();
        comparePerformance(concatManual, concatOptimized, "Concaténation de chaînes");

        // 3. Flux de données
        TestPerformanceStreamManual streamManual = new TestPerformanceStreamManual();
        TestPerformanceStreamOptimized streamOptimized = new TestPerformanceStreamOptimized();
        comparePerformance(streamManual, streamOptimized, "Utilisation des Streams");

        // 4. Boucles
        TestPerformanceLoopManual loopManual = new TestPerformanceLoopManual();
        TestPerformanceLoopOptimized loopOptimized = new TestPerformanceLoopOptimized();
        comparePerformance(loopManual, loopOptimized, "Optimisation des boucles");

        // 5. Compression
        TestPerformanceNoCompression noCompression = new TestPerformanceNoCompression();
        TestPerformanceCompression compression = new TestPerformanceCompression();
        comparePerformance(noCompression, compression, "Compression de données");
    }

    private static void comparePerformance(Object before, Object after, String testName) throws Exception {
        long startBefore = System.nanoTime();
        before.getClass().getMethod("execute").invoke(before);
        long endBefore = System.nanoTime();

        long startAfter = System.nanoTime();
        after.getClass().getMethod("execute").invoke(after);
        long endAfter = System.nanoTime();

        System.out.println(testName + " - Avant : " + (endBefore - startBefore) + " ns");
        System.out.println(testName + " - Après : " + (endAfter - startAfter) + " ns");
    }
}
