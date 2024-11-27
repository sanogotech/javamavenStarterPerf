package com.mycompany.app;

import java.util.*;

public class TestFULLPerormanceArrayListHahset {
    public static void main(String[] args) {
        // Comparer la recherche dans une ArrayList
        TestArrayList testArrayList = new TestArrayList();
        testArrayList.testContains();

        // Comparer la recherche dans un HashSet
        TestHashSet testHashSet = new TestHashSet();
        testHashSet.testContains();
    }
}

