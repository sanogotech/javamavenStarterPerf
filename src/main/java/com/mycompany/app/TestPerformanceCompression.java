package com.mycompany.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class TestPerformanceCompression {
    public void execute() throws IOException {
        FileOutputStream fos = new FileOutputStream("data.gz");
        // Compression des données avant stockage
        GZIPOutputStream gzipOut = new GZIPOutputStream(fos);
        gzipOut.write("Données compressées pour stockage.".repeat(10000).getBytes());
        gzipOut.close(); // Ecriture dans un fichier compressé pour économiser de l'espace
    }
}

