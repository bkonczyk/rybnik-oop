package pl.sda.collections.saturday;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookServiceWithStreams {

    private final List<Book> books;

    public BookServiceWithStreams(List<Book> books) {
        this.books = books;
    }

    // tutaj implementujecie metody z polecenia
    // #1
    public void addBook(Book bookToAdd) {
        books.add(bookToAdd);
    }

    // #2
    public void deleteBook(String title) {
        books.removeIf(next -> next.getTitle().equals(title));
    }

    // #3 zwracanie listy wszystkich książek
    public List<Book> getAllBooks() {
        return books;
    }

    public Long getNumberOfBooks(int number) {
        return books.stream().count();
    }

    // 5 zwracanie ksiazek sprzed 99'
    public List<Book> getBooksBefore99() {
        return books.stream()
                .filter(b -> b.getYear() < 1999)
                .collect(Collectors.toList());
    }

    // 6 najdroższa książka
    public Book getMostExpensiveBook() {
        Optional<Book> optionalBook = books.stream()
                .max(Comparator.comparing(Book::getPrice));
        return optionalBook.orElse(null);
    }

    public Book getCheapestBook() {
        return books.stream()
                .min(Comparator.comparing(Book::getPrice)).get();
    }

    public List<Book> getBooksWithPredicate(Predicate<Book> predicate) {
        return books.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public List<Book> getSortedBooksByPrice() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksByAuthor(Author author) {
        return books.stream()
                .filter(book -> book.getAuthors().contains(author))
                .collect(Collectors.toList());
    }
}
