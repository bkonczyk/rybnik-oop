package pl.sda.generics.first;

public class IntShouter {

    private int thingToShout;

    public IntShouter(int thingToShout) {
        this.thingToShout = thingToShout;
    }

    public void shout() {
        System.out.println(thingToShout + "!!!!!");
    }
}
