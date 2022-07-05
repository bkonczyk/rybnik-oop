package pl.sda.generics.first;

public class GenericShouter<T> {

    private T thingToShout;

    // int, double, float ->
    // Integer, Double, Float
    public GenericShouter(T thingToShout) {
        this.thingToShout = thingToShout;
    }

    public void shout() {
        System.out.println(thingToShout + "!!!!!");
    }
}
