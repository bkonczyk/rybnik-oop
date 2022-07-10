package pl.sda.functions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FirstLambda {

    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Anonymous meow");
        print(printable);

        Consumer<String> stringConsumer = someString -> System.out.println(someString);
        stringConsumer.accept("Something new");

        Function<Integer, Integer> increaseByTwo = number -> number + 2;
        Integer increasedByTwo = increaseByTwo.apply(10);
        System.out.println(increasedByTwo);

        BiFunction<String, String, String> concatenator = (a, b) -> a + b;
        System.out.println(concatenator.apply("Breaking ", "bad"));
    }

    public static void print(Printable printable) {
        printable.print();
    }

//    public static void consume(Consumer<String> consumer, String java) {
//        consumer.accept(java);
//    }

//    Consumer<String> sth = x -> System.out.println(x);
//        consume(sth, "java");
//
//        Function<Integer, Integer> increaseByTwo = x -> x + 2;
//        Integer apply = increaseByTwo.apply(10);
//        System.out.println(apply);
}
