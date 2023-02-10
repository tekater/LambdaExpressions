package ClosuresControlWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int word1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int word2 = new java.util.Scanner(System.in).nextInt();

        System.out.println("У нас получилось:\n" + Operator.binaryOperator.applyAsInt(word1,word2));
    }
}
