package pl.sda.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class First {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Lanos");
        cars.add("Passeratti Kombi");
        cars.add("Passeratti");
        cars.add("Clio");
        cars.add("Golf 4");
        cars.add(2, "Aventador");
        System.out.println(cars);
        cars.addAll(List.of("Tesla", "A class", "Multipla"));
        System.out.println(cars);
        String s = cars.get(2);
        System.out.println(s);
        cars.add("Tesla");
        cars.add("Tesla");
        cars.add("Tesla");
        cars.add("Tesla");
        cars.add("Tesla");

        System.out.println(cars);

//        deleteDuplicate(cars, "Tesla");
        deleteDuplicateIgnoreCase(cars, "TESLA");
        System.out.println(cars);

        int clio = cars.indexOf("Clio");
        System.out.println("Clio is on index: " + clio);

        Collections.reverse(cars);
        System.out.println(cars);

    }

    public static void deleteDuplicate(List<String> list, String duplicate) {
        boolean removed;
        do {
            removed = list.remove(duplicate);
        } while (removed);
    }

    public static void deleteDuplicateIgnoreCase(List<String> list, String duplicate) {
        ListIterator<String> iterator = list.listIterator();
        String lowerCaseDuplicate = duplicate.toLowerCase();
        while (iterator.hasNext()) {
            String next = iterator.next();
            String lowerCase = next.toLowerCase();
            if (lowerCase.equals(lowerCaseDuplicate)) {
                iterator.remove();
            }
        }
    }
}
