package com.epam.prejap.srp;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Grzegorz Konopka", LocalDate.of(1991,10,16));
        Author secondAuthor = new Author("Martyna Komenda", LocalDate.of(1997,01,28));

        Book firstBook = new Book("9781234567897",firstAuthor,"Testy zmęczeniowe Frontpressa",Category.CLASSICS);
        Book secondBook = new Book("9781234124897",secondAuthor,"Fundsze inwestycyjne",Category.CLASSICS);

        BookSaver.saveBookToAFile(firstBook);
        BookSaver.saveBookToAFile(secondBook);

        BookPrinter.printBooks();
    }
}
