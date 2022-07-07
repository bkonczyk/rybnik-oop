package pl.sda.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFun {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Sara");
        names.add("Grzegorz");
        names.add("Bartek");
        names.add("Jakub");
        System.out.println(names.add("Sara"));

        for (String name : names) {
            System.out.println(name);
        }

        boolean empty = names.isEmpty();
        System.out.println("Collection is empty: " + empty);

        int size = names.size();
        System.out.println("Collection size: " + size);

        boolean contains = names.contains("Grzegorz");
        System.out.println("Collection contains name Grzegorz: " + contains);

        boolean removed = names.remove("Grzegorz");
        System.out.println("Grzegorz was successfully removed: " + removed);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> names2 = Set.of("Tomek", "Weronika", "Mateusz", "Klaudia");
        names.addAll(names2);
        System.out.println(names);

        names.removeAll(names2);
        System.out.println(names);
    }
}
