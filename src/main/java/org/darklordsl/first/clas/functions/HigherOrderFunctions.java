package org.darklordsl.first.clas.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctions {

//    BiFunction<Float, Float, Float> diivide = (x, y) -> {
//        if (y == 0) {
//            throw new IllegalArgumentException("Cannot divide by zero");
//        }
//        return x / y;
//    };
//
//    /*
//    In this example, this function checking the argument y is zero or not. But methods should only
//    have one responsibility.
//     */


    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZero = (func) -> (x, y) -> {
            if (y == 0f) {
                System.out.println("Warning: Dividing by zero");
                return 0f;
            }

            return func.apply(x, y);
        };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZero.apply(divide);
        System.out.println(divideSafe.apply(10f, 2f));

    }
}
