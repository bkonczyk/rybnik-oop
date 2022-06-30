package pl.sda.oop_exercise;

//Zaimplementuj klasę `Lecturer`. Klasa ta powinna rozszerzać klasę `Person`.
// Dodatkowo powinna zawierać:
//
//* dwa pola: specjalizacja oraz wynagrodzenie
//* konstruktor z 4ema parametrami: specjalizacja, wynagrodzenie, name, address
//* metody typu getter dla zdeklarowanych pól
//* metody typu setter dla zdeklarowanych pól
//* metodę `toString` wyświetlającą szczegółowe informację o wykładowcy

import java.math.BigDecimal;

public class Lecturer extends Person {

    private String spec;
    private BigDecimal wage;

    public Lecturer(String name, String address, String spec, BigDecimal wage) {
        super(name, address);
        this.spec = spec;
        this.wage = wage;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + this.spec + " -> " + this.wage;
    }
}
