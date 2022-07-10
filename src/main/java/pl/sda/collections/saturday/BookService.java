package pl.sda.collections.saturday;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
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

    // #2
    public void deleteBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book next = iterator.next();
            if (next.getTitle().equals(title)) {
                iterator.remove();
            }
        }
    }

    // #3 zwracanie listy wszystkich książek
    public List<Book> getAllBooks() {
        return books;
    }

    // #3+ zwracanie określonej ilości książek
    public List<Book> getNumberOfBooks(int number) {
        ArrayList<Book> someBooks = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Book book = books.get(i);
            someBooks.add(book);
        }
        return someBooks;
    }

    // 4 zwracanie wszystkich fiction
    public List<Book> getFictionBooks() {
        ArrayList<Book> fictionBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(Genre.FICTION)) {
                fictionBooks.add(book);
            }
        }
        return fictionBooks;
    }

    // 5 zwracanie ksiazek sprzed 99'
    public List<Book> getBooksBefore99() {
        List<Book> oldBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() < 1999) {
                oldBooks.add(book);
            }
        }
        return oldBooks;
    }

    // 6 najdroższa książka
    public Book getMostExpensiveBook() {
        Book bookWithHighestPrice = getBookWithPrice("Ogniem i mieczem", BigDecimal.ZERO);
        for (Book book : books) {
            BigDecimal price = book.getPrice();
            if (price.doubleValue() > bookWithHighestPrice.getPrice().doubleValue()) {
                bookWithHighestPrice = book;
            }
        }
        return bookWithHighestPrice;
    }

    public Book getCheapestBook() {
        Book bookWithHighestPrice = getBookWithPrice("Piescia i butem", BigDecimal.valueOf(Integer.MAX_VALUE));
        for (Book book : books) {
            BigDecimal price = book.getPrice();
            if (price.doubleValue() < bookWithHighestPrice.getPrice().doubleValue()) {
                bookWithHighestPrice = book;
            }
        }
        return bookWithHighestPrice;
    }

    public List<Book> getBooksWithAtLeastAuthors(Integer minAuthors) {
        List<Book> booksWithAuthors = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().size() >= minAuthors) {
                booksWithAuthors.add(book);
            }
        }
        return booksWithAuthors;
    }

    public List<Book> getSortedBooks() {
        books.sort(Book::compareTo);
        return books;
    }

    public List<Book> getBooksByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> getBooksByAuthor(String firstName, String lastName) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getFirstName().equals(firstName) && author.getLastName().equals(lastName)) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    private Book getBookWithPrice(String theNewAwesomeTitle, BigDecimal price) {
        return new Book(null, theNewAwesomeTitle, price, null, null, null);
    }

    private Book getBookWith0Price() {
        return new Book(null, null, BigDecimal.ZERO, null, null, null);
    }

    private Book getBookWithMaxPrice() {
        return new Book(null, null, BigDecimal.valueOf(Integer.MAX_VALUE), null, null, null);
    }

}
