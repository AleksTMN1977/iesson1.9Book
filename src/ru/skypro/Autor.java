package ru.skypro;

public class Autor {
    String firstNameAuthor;
    String lastNameAuthor;
    String authorBook = firstNameAuthor + " " + lastNameAuthor;

    public Autor(String firstNameAuthor, String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
        this.firstNameAuthor = firstNameAuthor;
        this.authorBook = firstNameAuthor + " " + lastNameAuthor;
    }

    public String getAuthorBook() {
        return this.authorBook;
    }


}
