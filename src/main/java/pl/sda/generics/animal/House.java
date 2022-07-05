package pl.sda.generics.animal;

public class House {

    private Animal[] animals = new Animal[3];
//    private int currentNoOfAnimals = 0;


    void addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return;
            }
        }
    }
}

abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String getKind();
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    String getKind() {
        return "Cat";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    String getKind() {
        return "Dog";
    }
}

class GuineaPig extends Animal {

    public GuineaPig(String name) {
        super(name);
    }

    @Override
    String getKind() {
        return "GuineaPig";
    }
}
