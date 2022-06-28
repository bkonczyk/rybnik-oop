package pl.sda.first_abstract;

public abstract class Car {

    private String name;
    private Integer engine;
    private Integer year;

    abstract void runEngine();

    void describe() {
        System.out.println("Name: " + name + ", engine: " + engine + ", year: " + year);
    }

    public Car(String name, Integer engine, Integer year) {
        this.name = name;
        this.engine = engine;
        this.year = year;
    }
}

// 1. Create abstract class Car with three fields
// - String make
// - Integer engine
// - Short year
//2. Add method: abstract void runEngine()
//3. Create class Lanos that is extending class Car
//4. Implement the abstract method that will print out to the console: "I am usually broken"
//5. Create class Tesla that is extending class Car
//6. Implement the method void runEngine() that will print out to the console: "I'm out of juice"