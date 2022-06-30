package pl.sda.oop_exercise;

import java.math.BigDecimal;

public class School {

    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Bober",
                "Warszawa",
                "primary teacher",
                BigDecimal.valueOf(2000L)
        );
        Student student = new Student("Andrzej",
                "Wejcherowo",
                "daily",
                1990,
                BigDecimal.TEN);

        Person student2 = new Student("Artatur", "PZN", "daily", 1989, BigDecimal.ZERO);

        System.out.println(lecturer);
        System.out.println(student);
        System.out.println(student2);
    }
}
