package ru.skypro;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }
}
