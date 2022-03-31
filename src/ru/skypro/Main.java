package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Autor tolstoi = new Autor("Лев", "Толстой");
        Book voina = new Book("Война и мир", tolstoi.getAuthorBook(), 2017);
        Autor dostoevskiy = new Autor("Федор", "Достоевский");
        Book idiot = new Book("Идиот", dostoevskiy.getAuthorBook(), 2010);
        System.out.println("idiot.nameBook = " + idiot.getNameBook() + ", " + dostoevskiy.getAuthorBook() + ", " + idiot.getPublicationYear());
        System.out.println("tolstoi = " + tolstoi.getAuthorBook());
        voina.setPublicationYear(2020);
        System.out.println("voina.getPublicationYear() = " + voina.getPublicationYear());

    }
}
