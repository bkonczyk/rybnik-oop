package pl.sda.basics.days;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        UserInputProvider inputProvider = new UserInputProvider();
        LocalDateParser dateParser = new LocalDateParser();
        DurationCalculator calculator = new DurationCalculator();

        String firstUserInput = inputProvider.getUserInput();
        LocalDate firstDate = dateParser.toLocalDate(firstUserInput);

        String secondUserInput = inputProvider.getUserInput();
        LocalDate secondDate = dateParser.toLocalDate(secondUserInput);

        long daysBetween = calculator.daysBetween(firstDate, secondDate);
        System.out.println("Days between: " + daysBetween);
    }
}
