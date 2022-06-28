package pl.sda.basics.days;

import java.time.Duration;
import java.time.LocalDate;

public class DurationCalculator {

    public long daysBetween(LocalDate firstDate, LocalDate secondDate) {
        return Duration
                .between(firstDate.atStartOfDay(), secondDate.atStartOfDay())
                .toDays();
    }
}
