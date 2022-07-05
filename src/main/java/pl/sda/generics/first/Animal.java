package pl.sda.generics.first;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    String getName() {
        return this.getName();
    }

    abstract String makeNoise();
}