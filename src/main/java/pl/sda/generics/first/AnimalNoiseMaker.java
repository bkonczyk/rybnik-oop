package pl.sda.generics.first;

public class AnimalNoiseMaker<T extends Animal> {

    private final T animal;

    public AnimalNoiseMaker(T animal) {
        this.animal = animal;
    }

    public void makeNoise() {
        System.out.println(animal.makeNoise());
    }
}
