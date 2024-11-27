package com.mycompany.app;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestPerformanceNoCompression {
    public void execute() throws IOException {
        FileOutputStream fos = new FileOutputStream("data.txt");
        // Stockage direct des données sans compression
        fos.write("Données non compressées pour stockage.".repeat(10000).getBytes());
        fos.close();
    }
}

