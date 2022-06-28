package pl.sda.first_abstract;

public class Tesla extends Car {

    public Tesla(String name, Integer engine, Integer year) {
        super(name, engine, year);
    }

    @Override
    void runEngine() {
        System.out.println("I'm out of juice");
    }
}
