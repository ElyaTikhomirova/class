package ru.skypro;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int year;

    public Book(String nameBook, Author author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Book " + this.nameBook + "Author " + author;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return nameBook.equals(((Book) other).nameBook) && book.equals(((Book) other).year) && book.equals(((Book) other).author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}
