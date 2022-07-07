package pl.sda.collections.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Library {

    public static void main(String[] args) {
        HashSet<Author> authors = getAuthors();
        System.out.println("Number of authors: " + authors.size());
        for (Author author : authors) {
            System.out.println(author);
        }
        Iterator<Author> iterator = authors.iterator();
        while (iterator.hasNext()) {
            Author nextAuthor = iterator.next();
            if (nextAuthor.getFirstName().length() < 4) {
                iterator.remove();
            }
        }
        int i = 0;
        for (Author author : authors) {
            if (author.getFullNameCharactersNumber() > 11) {
                System.out.println(author);
                i++;
            }
        }
        System.out.println("There is " + i + " such authors");

    }

    private static HashSet<Author> getAuthors() {
        return new HashSet<>(
                Set.of(
                        Author.of("Stephen", "King"),
                        Author.of("J.K.", "Rowling"),
                        Author.of("Amy", "Tan"),
                        Author.of("Khaled", "Hosseini"),
                        Author.of("Tana", "French"),
                        Author.of("George R.R", "Martin"),
                        Author.of("Danzy", "Senna"),
                        Author.of("Atul", "Gawande")
                )
        );
    }
}
