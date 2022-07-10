package pl.sda.collections.saturday;

public class Author {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Author(Long id, String firstName, String lastName, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

enum Gender {
    F, M
}

