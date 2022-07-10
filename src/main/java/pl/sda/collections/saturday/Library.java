package pl.sda.collections.saturday;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

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

        BookServiceWithStreams serviceWithStreams = new BookServiceWithStreams(books);
        Book mostExpensiveBook1 = serviceWithStreams.getMostExpensiveBook();

        List<Book> fictionBooks2 = serviceWithStreams
                .getBooksWithPredicate(someBook -> someBook.getGenre().equals(Genre.FICTION));

        List<Book> bookWithMin2Authors = serviceWithStreams
                .getBooksWithPredicate(book -> book.getAuthors().size() > 1);

        List<Book> expensiveBooks = serviceWithStreams
                .getBooksWithPredicate(book -> book.getPrice().doubleValue() > 10d);

        Predicate<Book> oldBookPredicate = book -> book.getYear() < 1999;
        List<Book> oldBooks = serviceWithStreams
                .getBooksWithPredicate(oldBookPredicate);



        System.out.println("Haha");
    }
}
