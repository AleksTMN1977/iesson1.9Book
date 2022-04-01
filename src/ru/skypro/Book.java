package ru.skypro;

public class Book {
    private String nameBook;
    private int publicationYear;
    private Author author;

    public Book(String nameBook, int publicationYear, Author author) {
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
        this.author = author;

    }

    public String getNameBook() {
        return this.nameBook;
    }


    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
