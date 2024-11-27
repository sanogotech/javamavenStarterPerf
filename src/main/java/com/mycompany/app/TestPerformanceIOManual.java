package com.mycompany.app;

import java.io.FileWriter;
import java.io.IOException;

public class TestPerformanceIOManual {
    public void execute() throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Exemple de performance sans buffer.");
        writer.close();
    }
}
