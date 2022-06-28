package pl.sda.basics.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y: ");
        int y = scanner.nextInt();

        BasicCalculator basicCalculator = new BasicCalculator();
        basicCalculator.calculate(x, y);
    }
}
