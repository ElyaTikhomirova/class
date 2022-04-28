package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Author author = new Author("George", "Orwell");
        Book book = new Book("Nineteen Eighty-Four", author, 1948);
        System.out.println("book.nameBook = " + book.getNameBook());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.author = " + book.getAuthor().getFirstNameAuthor() +  " " + book.getAuthor().getLastNameAuthor());
        System.out.println("book.year = " + book.getYear());
        book.setYear(1950);
        System.out.println("book.getYear() = " + book.getYear());

        Author author1 = new Author("Aldous", "Huxley");
        Book anotherBook = new Book("Brave New World", author1, 1932);
        System.out.println("anotherBook = " + anotherBook.getNameBook());
        System.out.println("anotherBook.author = " + anotherBook.getAuthor());
        System.out.println("anotherBook.year = " + anotherBook.getYear());

        System.out.println("author.firstNameAuthor = " + author.getFirstNameAuthor());
        System.out.println("author.lastNameAuthor = " + author.getLastNameAuthor());


        System.out.println("author1.getFirstNameAuthor = " + author1.getFirstNameAuthor());
        System.out.println("author1.getLastNameAuthor = " + author1.getLastNameAuthor());

        System.out.println(author);
        System.out.println(book);


    }
}
