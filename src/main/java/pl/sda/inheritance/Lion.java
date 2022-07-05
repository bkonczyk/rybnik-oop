package pl.sda.inheritance;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "wrrrr";
    }

    @Override
    public String toString() {
        return "I am " + this.getName();
    }
}
