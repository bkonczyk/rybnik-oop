package pl.sda.generics.array;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 40, 50, 60};
        ArrayUtils.swap(tab, 2, 5);
        System.out.println(Arrays.toString(tab));

        String[] stringTab = {"One", "Two", "Three", "Four", "Five", "Six"};
        ArrayUtils.swap(stringTab, 2, 3);
        System.out.println(Arrays.toString(stringTab));

    }
}

class ArrayUtils {
    //    Zaimplementuj generyczną metodę `swap`, która będzie odpowiedzialna za
//    zamianę pozycji wskazanych elemetów tablicy.
    static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
