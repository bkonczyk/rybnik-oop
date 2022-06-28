package pl.sda.basics.calculator;

public class BasicCalculator {

    public void calculate(int x, int y) {
        System.out.println("X + Y = " + (x + y));
        System.out.println("X - Y = " + (x - y));
        System.out.println("X * Y = " + (x * y));
        if (y != 0) {
            System.out.println("X / Y = " + (x / y));
        } else {
            System.out.println("Cannot divide by 0");
        }
    }
}
