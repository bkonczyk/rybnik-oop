package pl.sda.collections;

import java.util.HashSet;
import java.util.Set;

public class MySetExercises {

    public static void main(String[] args) {
        Set<String> companies = new HashSet<>(Set.of("ZRB", "DSBUD", "Budimex", "Skanska", "Accenture",
                "Future Processing", "Alan Systems", "Microsoft", "Google"));
        print(companies);
        System.out.println("Set size: " + companies.size());
        System.out.println("Removing Google: " + companies.remove("Google"));
        print(companies);
        HashSet<String> companies2 = new HashSet<>(companies);
        print(companies2);
        companies.addAll(Set.of("Amazon", "Pudzian Trans", "Olimp"));
        print(companies);
    }

    private static void print(Set<String> companies) {
        for (String company : companies) {
            System.out.println(company);
        }
    }
}
