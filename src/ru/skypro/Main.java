package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Book book = new Book("Nineteen Eighty-Four", "George Orwell", 1948);
        System.out.println("book.nameBook = " + book.getNameBook());
        System.out.println("book.author = " + book.getNameBook());
        System.out.println("book.year = " + book.getYear());
        book.setYear(1950);
        System.out.println("book.getYear() = " + book.getYear());

        Book anotherBook = new Book("Brave New World", "Aldous Huxley", 1932);
        System.out.println("anotherBook = " + anotherBook.getNameBook());
        System.out.println("anotherBook.author = " + anotherBook.getAuthor());
        System.out.println("anotherBook.year = " + anotherBook.getYear());

        Author author = new Author("George", "Orwell");
        System.out.println("author.firstNameAuthor = " + author.getFirstNameAuthor());
        System.out.println("author.lastNameAuthor = " + author.getLastNameAuthor());

        Author author1 = new Author("Aldous", "Huxley");
        System.out.println("author1.getFirstNameAuthor = " + author1.getFirstNameAuthor());
        System.out.println("author1.getLastNameAuthor = " + author1.getLastNameAuthor());


    }
}
