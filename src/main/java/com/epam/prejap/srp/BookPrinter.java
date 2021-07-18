package com.epam.prejap.srp;

import java.io.File;
import java.nio.file.Path;

public class BookPrinter {

    private BookPrinter() {}

    public static void printBooks() {
        for (String line: BookReader.readBooksFromFile(new File(Path.of("src","main","resources","books.txt").toUri()))) {
            System.out.println(line);
        }
    }
}
