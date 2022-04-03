package ru.skypro;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название книги '" + nameBook + '\'' +
                ", год публикации " + publicationYear + ", " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, publicationYear);
    }
}
