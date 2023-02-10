package example2;

import java.util.function.*; // звёздочка обозначает всё что в package

public class Main {
    public static void main(String[] args) {
        // Если один аргумент, то () - опциональный
        Function<Integer, Integer> adder1 = x -> x + 1;
        System.out.println(adder1.apply(1));
        // С принудительной поддержкой типа
        Function<Integer, Integer> mult2 = x -> x * 2;
        System.out.println(mult2.apply(2));
        // Множественные выражения
        Function<Integer, Integer> adder5 = (x) -> {
            x += 2;
            x += 3;
            return x;
        };
        System.out.println(adder1.apply(5));
    }
}
