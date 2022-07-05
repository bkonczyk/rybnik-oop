package pl.sda.generics.first;

public class DoubleShouter {

    private double thingToShout;

    public DoubleShouter(double thingToShout) {
        this.thingToShout = thingToShout;
    }

    public void shout() {
        System.out.println(thingToShout + "!!!!!");
    }
}
