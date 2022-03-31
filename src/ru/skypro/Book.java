package ru.skypro;

public class Book {
    private String nameBook;
    private int publicationYear;
    public Book(String nameBook, String authorBook, int publicationYear) {
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;

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
