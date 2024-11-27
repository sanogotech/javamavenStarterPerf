package com.mycompany.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestPerformanceIOBuffer {
    public void execute() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Exemple de performance avec BufferedWriter.");
        writer.close();
    }
}
