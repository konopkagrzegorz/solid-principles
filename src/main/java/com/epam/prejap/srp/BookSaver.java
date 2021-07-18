package com.epam.prejap.srp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public final class BookSaver {

    private BookSaver() {}

    public static void saveBookToAFile(Book book) {
        Path path = Path.of("src","main","resources","books.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(
                path,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {
            writer.write(book.toString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
