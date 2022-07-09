package pl.sda.collections.exercise;

public class Author {

    public static Long lastId = 0L;

    private final Long id;
    private final String firstName;
    private final String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    private Author(String firstName, String lastName) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Author of(String firstName, String lastName) {
        return new Author(firstName, lastName);
    }

    public int getFullNameCharactersNumber() {
        return firstName.length() + lastName.length();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
