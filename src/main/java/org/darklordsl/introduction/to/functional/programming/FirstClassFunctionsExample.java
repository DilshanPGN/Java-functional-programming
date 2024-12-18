package org.darklordsl.introduction.to.functional.programming;

import java.util.function.Function;

public class FirstClassFunctionsExample {


    public static void main(String[] args) {

        // Assigning a lambda expression to a Function variable
        Function<Integer, Integer> square = x -> x * x;

        // Passing a function as an argument
        int result = applyFunction(5, square);
        System.out.println("Square of 5: " + result);
        // Returning a function from another function

        Function<Integer, Integer> increment = createIncrementFunction();
        System.out.println("Increment 5: " + increment.apply(5));

    }

    // Method that takes a Function as an argument
    public static int applyFunction(int value, Function<Integer, Integer> function) {
        return function.apply(value);
    }

    // Method that returns a Function p
    public static Function<Integer, Integer> createIncrementFunction() {
        return x -> x + 1;
    }
}
