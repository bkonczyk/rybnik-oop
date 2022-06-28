package pl.sda.inheritance;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "wrrrr";
    }
}
