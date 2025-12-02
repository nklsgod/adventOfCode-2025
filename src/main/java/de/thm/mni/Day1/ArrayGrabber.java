package de.thm.mni.Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArrayGrabber {

    public String[] getArray(String path) {
        try {
            // 1. Versucht, die Datei am angegebenen Pfad zu lesen
            // Files.readAllLines liest die Datei Zeile für Zeile in eine Liste
            List<String> lines = Files.readAllLines(Paths.get(path));

            // 2. Wandelt die Liste in das geforderte String-Array um
            return lines.toArray(new String[0]);

        } catch (IOException e) {
            // Falls die Datei nicht gefunden wird: Fehlermeldung drucken
            System.err.println("Fehler beim Lesen der Datei: " + path);
            e.printStackTrace();

            // Leeres Array zurückgeben, damit die Main-Methode nicht abstürzt
            return new String[0];
        }
    }
}