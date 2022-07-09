package pl.sda.collections.saturday;

import java.util.List;

import static pl.sda.collections.saturday.BooksInitializer.initializeBooks;

public class Library {

    public static void main(String[] args) {
        List<Book> books = initializeBooks();
        BookService service = new BookService(books);
    }
}
