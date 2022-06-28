package pl.sda.inheritance;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }
}