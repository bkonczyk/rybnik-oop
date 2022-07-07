package pl.sda.collections.exercise;

public class Author {

    private final String firstName;
    private final String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private Author(String firstName, String lastName) {
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
