package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Author tolstoi = new Author("Лев", "Толстой");
        Book voina = new Book("Война и мир", 2017, tolstoi);
        Book voina1 = new Book("Война и мир", 2005, tolstoi);

        Author dostoevskiy = new Author("Федор", "Достоевский");
        Book idiot = new Book("Идиот", 2010, dostoevskiy);

        Author chehov = new Author("Антон", "Чехов");
        Book kashtan = new Book("Каштанка", 1887, chehov);

        System.out.println(kashtan);
        System.out.println(idiot);
        System.out.println(voina);
        System.out.println(voina.equals(voina1));

    }
}
