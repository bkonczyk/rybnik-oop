package pl.sda.generics.first;

import pl.sda.inheritance.Lion;

public class MainShouter {

    public static void main(String[] args) {
        IntShouter intShouter = new IntShouter(10);
        intShouter.shout();

        GenericShouter<Integer> integerShouter = new GenericShouter<>(10);
        integerShouter.shout();

        GenericShouter<Double> doubleShouter = new GenericShouter<>(20.0);
        doubleShouter.shout();

        GenericShouter<Lion> lionShouter = new GenericShouter<>(new Lion("Simba"));
        lionShouter.shout();
    }
}
