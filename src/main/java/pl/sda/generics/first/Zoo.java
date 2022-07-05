package pl.sda.generics.first;

public class Zoo {

    public static void main(String[] args) {
        Lion lion = new Lion("Pumba");
        AnimalNoiseMaker<Lion> lionNoiseMaker = new AnimalNoiseMaker<>(lion);
        lionNoiseMaker.makeNoise();

        Dog dog = new Dog("Puszek");
        AnimalNoiseMaker<Dog> dogNoiseMaker = new AnimalNoiseMaker<>(dog);
        dogNoiseMaker.makeNoise();

        System.out.println("#######################");
        AnimalNoiseMaker<Animal> animalNoiseMaker = new AnimalNoiseMaker<>(lion);
        animalNoiseMaker.makeNoise();
        animalNoiseMaker = new AnimalNoiseMaker<>(dog);
        animalNoiseMaker.makeNoise();

    }
}

class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    String makeNoise() {
        return "wrrrr";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    String makeNoise() {
        return "hau hau";
    }
}
