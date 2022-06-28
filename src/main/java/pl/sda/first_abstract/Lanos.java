package pl.sda.first_abstract;

public class Lanos extends Car {

    public Lanos(String name, Integer engine, Integer year) {
        super(name, engine, year);
    }

    @Override
    void runEngine() {
        System.out.println("I usually am broken");
    }
}
