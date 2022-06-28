package pl.sda.first_abstract;

public class RaceTrack {

    public static void main(String[] args) {
        Car lanos = new Lanos("Lanos", 1500, 2004);
        Car tesla = new Tesla("Tesla", 6000, 2022);
        lanos.runEngine();
        tesla.runEngine();
    }
}
