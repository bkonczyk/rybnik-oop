package pl.sda.second_inner;

public class Vehicle {

    private String name;
    private StaticEngine staticEngine;
    private Engine engine;

    public Vehicle() {
    }

    public Vehicle(String name, StaticEngine staticEngine, Engine engine) {
        this.name = name;
        this.staticEngine = staticEngine;
        this.engine = engine;
    }

    static class StaticEngine {
        Integer volume;
        String fuel;
    }



    class Engine {
        Integer volume;
        String fuel;

        public Engine(Integer volume, String fuel) {
            this.volume = volume;
            this.fuel = fuel;
        }
    }
}
