package pl.sda.basics.days;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateParser {

    public LocalDate toLocalDate(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(input, formatter);
    }
}
