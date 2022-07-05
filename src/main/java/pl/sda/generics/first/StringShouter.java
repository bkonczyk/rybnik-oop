package pl.sda.generics.first;

public class StringShouter {

    private String thingToShout;

    public StringShouter(String thingToShout) {
        this.thingToShout = thingToShout;
    }

    public void shout() {
        System.out.println(thingToShout + "!!!!!");
    }
}
