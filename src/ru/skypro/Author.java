package ru.skypro;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorBook, author.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorBook);
    }

    @Override
    public String toString() {
        return "Автор книги '" + authorBook + '\'';
    }

}
