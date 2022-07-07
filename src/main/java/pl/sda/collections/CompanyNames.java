package pl.sda.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CompanyNames {
    public static void main(String[] args) {
        Set<String> companies = new HashSet<>(Set.of("ZRB", "DSBUD", "Budimex", "Skanska", "Accenture",
                "Future Processing", "Alan Systems", "Microsoft", "Google"));
        System.out.println("Printing out all companies: ");
        printAll(companies);
        printLineBreak();
        boolean removeResult = companies.remove("Google");
        System.out.println("The Google was removed: " + removeResult);
        HashSet<String> companies2 = new HashSet<>(companies);
        System.out.println("Printing second set: ");
        printAll(companies2);
        printLineBreak();
        companies.addAll(Set.of("Amazon", "Pudzian Trans", "Olimp"));
        Iterator<String> iterator = companies.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.length() > 6) {
                iterator.remove();
            }
        }
        printAll(companies);

// This is a clever way to create the iterator and call iterator.hasNext() like
// you would do in a while-loop. It would be the same as doing:
//     Iterator<String> iterator = list.iterator();
//     while (iterator.hasNext()) {
//        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
//            String string = iterator.next();
//            if (string.isEmpty()) {
//                // Remove the current element from the iterator and the list.
//                iterator.remove();
//            }
//        }
    }

    private static void printAll(Set<String> companies) {
        for (String company : companies) {
            System.out.println(company);
        }
    }

    private static void printLineBreak() {
        System.out.println("#############################");
    }
}
