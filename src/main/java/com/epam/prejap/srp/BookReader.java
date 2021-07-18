package com.epam.prejap.srp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public final class BookReader {

    private BookReader() {}

    public static List<String> readBooksFromFile(File file)  {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Path.of(file.getPath()));
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return lines;
    }
}
