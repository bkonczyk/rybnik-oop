package pl.sda.second_inner;

public class Runner {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle.StaticEngine staticEngine = new Vehicle.StaticEngine();
        Vehicle.Engine engine = new Vehicle().new Engine(1000, "PB");
        Vehicle vehicle = new Vehicle("Lanos", new Vehicle.StaticEngine(), new Vehicle().new Engine(1000, "PB"));
    }
}
