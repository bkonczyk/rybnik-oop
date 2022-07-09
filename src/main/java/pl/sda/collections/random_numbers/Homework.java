package pl.sda.collections.random_numbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Homework {

    public static final int LIMIT_NUMBER = 200;
    public static final int BOUND = 1001;

    public static void main(String[] args) {
        Set<Integer> numbers = initiateRandomNumbersSet();
        System.out.println(numbers.size());

        countLargeNumbers(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
//        numbers.removeIf(numbersRemove -> numbersRemove % 2 == 1);
        System.out.println(numbers);
    }

    private static Set<Integer> initiateRandomNumbersSet() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        int numberOfNumbers = 100;
        System.out.println("I am creating a set of " + numberOfNumbers + " numbers");
        for (int i = 0; i < numberOfNumbers; i++) {
            int r = random.nextInt(BOUND);
            boolean added = numbers.add(r);
            if (added) {
                System.out.println(r);
            }
        }
        printLineBreak();
        return numbers;
    }

    private static void countLargeNumbers(Set<Integer> numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number > LIMIT_NUMBER) {
                counter++;
            }
        }
        System.out.println("there are " + counter + " numbers larger than " + LIMIT_NUMBER);
        printLineBreak();
    }

    private static void printLineBreak() {
        System.out.println("########################################");
    }

}

//1. Create a Set with 100 random Integers from a range 0 - 1000.
//2. Print them all out.
//3. Print out the number of integers. Were all 100 added?
//4. Count the integers with value higher than 50.
//5. Remove all uneven numbers.
//6. Print out what's left.