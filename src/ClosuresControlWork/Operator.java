package ClosuresControlWork;

import java.util.function.IntBinaryOperator;

public class Operator {
    public static IntBinaryOperator binaryOperator = (x,y) -> {
        if(x > y) {
            return x;
        }else if (y > x){
            return y;
        }else{
            System.out.println("Они одинаковы или вы допустили ошибку в вводе");
            return 0;
        }
    };

}
