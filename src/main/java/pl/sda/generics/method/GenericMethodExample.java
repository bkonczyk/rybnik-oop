package pl.sda.generics.method;

import pl.sda.inheritance.Animal;
import pl.sda.inheritance.Lion;

import java.math.BigDecimal;

public class GenericMethodExample {

    public static void main(String[] args) {
        shout("Damn");
        shout(10);
        shout(BigDecimal.TEN);
        shout(new Lion("Pumba"));
    }

    private static <T> void shout(T sthToShout) {
        System.out.println(sthToShout + "!!!!!!!!!!!!!");
    }
}


