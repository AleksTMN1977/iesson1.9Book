package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Author tolstoi = new Author("Лев", "Толстой");
        Book voina = new Book("Война и мир", 2017, tolstoi);

        Author dostoevskiy = new Author("Федор", "Достоевский");
        Book idiot = new Book("Идиот", 2010, dostoevskiy);

        System.out.println("idiot.nameBook = " + idiot.getNameBook() + ", " + dostoevskiy.getAuthorBook() + ", " + idiot.getPublicationYear());
        System.out.println("tolstoi = " + tolstoi.getAuthorBook());
        voina.setPublicationYear(2020);
        System.out.println("voina.getPublicationYear() = " + voina.getPublicationYear());
    }
}
