package pl.sda.collections.saturday;

import java.math.BigDecimal;
import java.util.List;

import static pl.sda.collections.saturday.AuthorsInitializer.genRandomAuthors;
import static pl.sda.collections.saturday.BooksInitializer.initializeBooks;

public class Library {

    public static void main(String[] args) {
        List<Book> books = initializeBooks();
        BookService service = new BookService(books);
        service.addBook(
                new Book(202L, "Hunting Evil", BigDecimal.ONE, 2022, Genre.THRILLER, genRandomAuthors())
        );
        List<Book> someBooks = service.getNumberOfBooks(20);
        List<Book> fictionBooks = service.getFictionBooks();
        Book mostExpensiveBook = service.getMostExpensiveBook();
        Book cheapestBook = service.getCheapestBook();
        List<Book> sortedBooks = service.getSortedBooks();
        System.out.println("Haha");
    }
}
