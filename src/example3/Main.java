package example3;

import java.util.function.Function;

public class Main {
    private static void printResultOfLambda(Function<String, Integer> function){
        System.out.println("GET READY FOR THE NEXT BATTLE" + "\nlength: " + function.apply("GET READY FOR THE NEXT BATTLE"));
    }
    public static void main(String[] args) {
        //Function<String, Integer> function = string -> string.length();
        //printResultOfLambda(function);

        //System.out.println();

        // Вложили без ссылки
        printResultOfLambda(s -> s.length());
    }
}
