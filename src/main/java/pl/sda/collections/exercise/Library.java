package pl.sda.collections.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public class Library {

//1. Rozszerzyć klasę Author o pole Long id;
//2. Dodać pole Long id normalnie do konstruktora
//W library zaimplementować metodę:
//private static Author findById(Set<Author> authors, Long id)
//3. Wymyśleć, jak można zrobić, żeby przy tworzeniu Authora nie było potrzeby manualnego podawania mu id.

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
        System.out.println(findById(authors, 5L));

        Author foundAuthor = findById(authors, 158L);
        if (foundAuthor != null) {
            System.out.println(foundAuthor.getFirstName());
        }

        Optional<Author> byId = getById(authors, 158L);
        if(byId.isPresent()) {
            Author author = byId.get();
            System.out.println(author.getFirstName());
        }
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

    public static Author findById(Set<Author> authors, Long id) {
        for (Author author : authors) {
            if (author.getId().equals(id)) {
                return author;
            }
        }
        return null;
    }

    public static Optional<Author> getById(Set<Author> authors, Long id) {
        for (Author author : authors) {
            if (author.getId().equals(id)) {
                return Optional.of(author);
            }
        }
        return Optional.empty();
    }
}
