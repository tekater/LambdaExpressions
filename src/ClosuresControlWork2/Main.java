package ClosuresControlWork2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        System.out.println("У нас получилось: \n" +
                Operator.unaryOperator.applyAsLong(new java.util.Scanner(System.in).nextLong()));
    }
}
