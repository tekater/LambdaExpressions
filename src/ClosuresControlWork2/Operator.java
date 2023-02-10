package ClosuresControlWork2;

import java.util.function.LongUnaryOperator;

public class Operator {
    public static LongUnaryOperator unaryOperator = (x) -> {
        if (((x+1) % 2) == 0) {
            System.out.println("Число было не чётным, пришлось увеличить значение :(");
            return ++x;
        }else {
            System.out.println("Число было чётным, преобразуем в следующее чётное значение :)");
            return x+2;
        }
    };
}
