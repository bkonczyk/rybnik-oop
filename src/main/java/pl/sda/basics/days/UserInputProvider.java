package pl.sda.basics.days;

import java.util.Scanner;

public class UserInputProvider {

    public String getUserInput() {
        System.out.println("Please enter date: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
