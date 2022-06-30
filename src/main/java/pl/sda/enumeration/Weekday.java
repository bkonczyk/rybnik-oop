package pl.sda.enumeration;

//Stwórz klasę enum `Weekday` ze stałymi `MONDAY`, `TUESDAY`, ... `SUNDAY`.
// Enum powinien zawierać metody `boolean isWeekDay` oraz `boolean isHoliday`. Metoda `isHoliday` powinna zwracać rezultat przeciwny od rezultuatu wywołania metody `isWeekDay`.
public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    boolean isWeekDay() {
        return !isHoliday();
    }
}
