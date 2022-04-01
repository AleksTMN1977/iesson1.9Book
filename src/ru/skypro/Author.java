package ru.skypro;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;
    private String authorBook;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
        this.firstNameAuthor = firstNameAuthor;
        this.authorBook = firstNameAuthor + " " + lastNameAuthor;
    }

    public String getAuthorBook() {

        return this.authorBook;
    }


}
