package pl.sda.collections.saturday;

import java.util.List;

public class BookService {

    private final List<Book> books;

    public BookService(List<Book> books) {
        this.books = books;
    }

    // tutaj implementujecie metody z polecenia
    // #1
    public void addBook(Book bookToAdd) {
        books.add(bookToAdd);
    }
}
