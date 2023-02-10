package example1;

import java.util.function.BiFunction;

public class Main {

    public static boolean isDivisible1(int x, int y) {
        return x % y == 0;
    }
    public static void main(String[] args) {
        // однострочное лямбда выражение которое проверяетделится ли нацело
        // первое число на второе число
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;
        System.out.println("Примитывный (Java) метод: \nx % y =: " + isDivisible1(5,7));
        System.out.println("Лямбда функция: \nx % y =: " + isDivisible.apply(10,2));
    }
}
