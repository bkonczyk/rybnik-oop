package pl.sda.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(
                List.of("yellow", "blue", "red", "green",
                        "white", "black"));
        System.out.println(colors);

    }

    private static void insertAsFirst(List<String> list, String element) {
        list.add(0, element);
    }

    private static String retrieve(List<String> list, int index) {
        return list.get(index);
    }

    private static void update(List<String> list, String existing, String newElement) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(existing)) {
                list.set(i, newElement);
            }
        }
    }

    private static void deleteThird(List<String> list) {
        list.remove(2);
    }

    private static String searchElement(List<String> list, String element) {
        for (String s : list) {
            if (s.equals(element)) {
                return s;
            }
        }
        return null;
    }

    private static void copyOneIntoAnother(List<String> one, List<String> another) {
        one.addAll(another);
    }

    private static void reverse(List<String> list) {
        Collections.reverse(list);
    }

    private static void replaceSecond(List<String> list, String element) {
        list.set(2, element);
    }

    private static boolean isEmpty(List<String> list) {
        return list.isEmpty();
    }

    private static void printAll(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
