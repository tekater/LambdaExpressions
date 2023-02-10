package example4;

import java.util.function.Function;

public class Main {
    public static int printResultOfLambda(Function<String,Integer> function) {
        System.out.println("Введите ваше число: ");
        String word = new java.util.Scanner(System.in).nextLine();//"123 321";
        System.out.println(function.apply(word));
        return function.apply(word);
    }
    public static void main(String[] args) {
        printResultOfLambda(string -> {
            int count = 0;
            for (char character : string.toCharArray()) {
                if(Character.isDigit(character)) {
                    count++;
                }
            }
            return count;
        });
    }
}
