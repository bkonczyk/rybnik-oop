package pl.sda.third_interfaces;

public class Main {
    public static void main(String[] args) {
        Animal fish = new Animal() {
            @Override
            public void move() {
                System.out.println("I am swimming");
            }
        };
        fish.move();
    }

    interface Animal {
        void move();
    }
}
