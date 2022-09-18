package objectMethodsHomework;

import objectshomework.Author;
import objectshomework.Book;

public class Main {
    public static void main(String[] args) {
//        personService personService = new personService();
//        Person sarah = new Person("sarah",30);
//        if (personService.isAdult(sarah)) {
//            System.out.println("Иди в бар");
//        } else {
//            System.out.println("Иди в школу");
//        }
//        System.out.println(sarah);
//
        var author = new objectshomework.Author("Ivan", "Ivanov");
        var author1 = new Author("Maksim", "Petrov");
        var book1 = new objectshomework.Book("book1", author , 2000);
        var book2 = new Book("book2", author1, 2001);
        book1.setPublicationYear(2001);
        book2.setPublicationYear(2003);
        System.out.println(book1);
        System.out.println(book2);
    }
}
