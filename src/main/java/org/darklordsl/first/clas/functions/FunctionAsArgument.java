package org.darklordsl.first.clas.functions;

import java.util.function.BiFunction;

public class FunctionAsArgument {
    // Add method
    public static Integer add(Integer x, Integer y) {
        return x + y;
    }

    // Subtract method
    public static Integer subtract(Integer x, Integer y) {
        return x - y;
    }

    // Combine two and three method
    public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc) {
        return combineFunc.apply(2, 3);
    }

    public static void main(String[] args) {
        // Using add function
        System.out.println(FunctionAsArgument.combine2And3(FunctionAsArgument::add)); // Output: 5

        // Using subtract function
        System.out.println(FunctionAsArgument.combine2And3(FunctionAsArgument::subtract)); // Output: -1

        // Using a lambda expression
        System.out.println(FunctionAsArgument.combine2And3((x, y) -> 2 * x + 2 * y)); // Output: 10
    }

}