package com.epam.prejap.srp;

public final class Book {

    private final String isbn;
    private final Author author;
    private final String title;
    private final Category category;

    public Book(String isbn, Author author, String title, Category category) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!isbn.equals(book.isbn)) return false;
        if (!author.equals(book.author)) return false;
        if (!title.equals(book.title)) return false;
        return category == book.category;
    }

    @Override
    public int hashCode() {
        int result = isbn.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("Title: %s%nISBN: %s%nAuthor: %s%nCategory: %s%n", title,isbn,author,category);
    }
}
