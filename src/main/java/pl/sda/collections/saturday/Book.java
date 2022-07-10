package pl.sda.collections.saturday;

import java.math.BigDecimal;
import java.util.List;

public class Book implements Comparable {

    private final Long id;
    private final String title;
    private final BigDecimal price;
    private final Integer year;
    private final Genre genre;
    private final List<Author> authors;

    public Book(Long id, String title, BigDecimal price, Integer year, Genre genre, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.year = year;
        this.genre = genre;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public Integer getYear() {
        return year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Object o) {
        Book b = (Book) o;
        return this.getTitle().compareTo(b.getTitle());
    }
}

enum Genre {
    COMEDY, DRAMA, THRILLER, HORROR, FICTION
}