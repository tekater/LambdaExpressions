package closures;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Другой важный трюк с лямда выражениями - это возможность захвата
        // из контекста где лямбда выражения объявления и использовать значения
        // внутри тела - техника называется: closures
        // Захват переменной возможен, только если она константа (final) или
        // она по факту не изменяется во время выполнения всего блока кода (effectively final)

        // пример с final константой
        final String hello = "Hello, ";

        Function<String, String> helloFunction = (name) -> hello + name + ".";
        System.out.println(helloFunction.apply("Jin Kazama"));
        System.out.println(helloFunction.apply("Heihachi Mishima"));

        // Пример с фактической константой (effectively final)
        int constant = 100;
        Function<Integer, Integer> adder100 = x -> x + constant;
        System.out.println("\n" + adder100.apply(300));
        System.out.println(adder100.apply(400));
    }
}
